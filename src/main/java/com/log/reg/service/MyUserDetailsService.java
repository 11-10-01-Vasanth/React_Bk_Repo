//package com.log.reg.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.log.reg.model.User;
//import com.log.reg.model.UserPrincipal;
//import com.log.reg.repo.UserRepository;
//
//@Service
//public class MyUserDetailsService implements UserDetailsService {
//
//	@Autowired
//	private UserRepository userRepo;
//	
//	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		User user = userRepo.findByUsername(username);
//		if(user==null)
//		{
//			throw new UsernameNotFoundException("User 404");
//		}
//		return new UserPrincipal(user);
//	}
//
//}
