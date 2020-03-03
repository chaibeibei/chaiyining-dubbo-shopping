package com.chaiyining.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chaiyining.service.UserService;

@Controller
public class UserController {

	@Reference(timeout=2000,version="1.0.0")
	private UserService userService;
	
	
	//前往登录页面
	@RequestMapping("tologin")
	public String toLogin() {
		return "login";
	}
	
	//登录
	@RequestMapping("login")
	public String login(String name,String password ) {
		
		System.out.println("name " + name + " password " + password);
		
		if(userService.login(name, password))
			return "redirect:/";
		else {
			return "login";
		}
	}
}
