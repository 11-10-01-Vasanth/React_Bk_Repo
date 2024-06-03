package com.log.reg.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.log.reg.model.Register;
import com.log.reg.repo.RegisterRepo;
import com.log.reg.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	private RegisterRepo registerRepo;

	@Override
	public boolean setRegister(Register register) {
		if(registerRepo.existsByUsername(register.getUsername())) {
			return false;
		}
		registerRepo.saveAndFlush(register);
		return true;
	}

	@Override
	public boolean checkData(String username, String password) {
		
		Register register = registerRepo.findByUsername(username);
		if(register!= null && register.getPassword().equals(password))
			return true;
		else
			return false;
	}
	
	
}
