package com.chaiyining.start;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStart {

public static void main(String[] args) throws IOException {
	
	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-*.xml");
	context.start();
	
	System.out.println("服务已启动");
	
	System.in.read();
}
	
}
