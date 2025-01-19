package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfigClass;
import com.entity.Register;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class);

		Register rs = context.getBean(Register.class);
		rs.setUserId(101);  
		rs.setFirstName("Amit");  
		rs.setLastName("Sharma");  
		rs.setAge(25);  
		rs.setDob("1998-07-15");  
		rs.setAddress("Mumbai, Maharashtra");  
		rs.setEmail("amit.sharma@example.com");  
		rs.setPassword("securePassword123");  
		System.out.println(rs);
	}
}
