package com.log.reg.service;

import org.springframework.http.ResponseEntity;

import com.log.reg.dto.RegisterDto;
import com.log.reg.model.Register;

public interface RegisterService {
	boolean setRegister(Register register);
	boolean checkData(String username, String password);
//	Register saveUser(Register register);
}
