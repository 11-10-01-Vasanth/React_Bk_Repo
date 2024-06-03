package com.log.reg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.log.reg.dto.RegisterDto;
import com.log.reg.model.Register;
import com.log.reg.repo.RegisterRepo;
import com.log.reg.service.RegisterService;

@RestController
@RequestMapping("/user")
public class RegisterController {

	@Autowired
	private RegisterService registerService;

	@PostMapping("/register")
	public ResponseEntity<Boolean> setRegister(@RequestBody Register register) {
		boolean success = registerService.setRegister(register);
		return ResponseEntity.status(HttpStatus.OK).body(success);
	}

	@PostMapping("/login")
	public ResponseEntity<?> checkData(@RequestBody RegisterDto registerDto) {
		boolean success = registerService.checkData(registerDto.getUsername(), registerDto.getPassword());
		return ResponseEntity.status(HttpStatus.OK).body(success);
	}

//	@PostMapping("/login")
//	public ResponseEntity<Boolean> checkData(@RequestBody RegisterDto registerDto)
//	{
//		boolean success = registerService.checkData(registerDto.getUsername(), registerDto.getPassword());
//		return ResponseEntity.status(HttpStatus.OK).body(success);
//	}

//	@PostMapping(value = "/save")
//    public ResponseEntity saveUser(@RequestBody Register register) {
//        try {
//            Register userResponse = registerService.saveUser(register);
//            return ResponseEntity.ok(userResponse);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

}