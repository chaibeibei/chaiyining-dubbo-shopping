package com.chaiyining.service.impl;

import org.apache.dubbo.config.annotation.Service;

import com.chaiyining.service.UserService;

@Service(interfaceClass=UserService.class,version="1.0.0")
public class UserServiceImpl implements UserService{

	@Override
	public boolean login(String userName, String passWord) {
		
		return "admin".equals(userName) && "123456".equals(passWord);
	}

}
