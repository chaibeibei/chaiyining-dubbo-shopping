package com.chaiyining.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.chaiyining.config.AdminProperties;
import com.chaiyining.service.UserService;

@Service(interfaceClass=UserService.class,version="1.0.0")
public class UserServiceImpl implements UserService{

	// 得到管理员的信息
		@Autowired
		AdminProperties adminPro;

	@Override
	public boolean login(String userName, String passWord) {
		
		return (adminPro.getAdminName().equals(userName) 
				&& adminPro.getPassword().equals(passWord));
	}

}
