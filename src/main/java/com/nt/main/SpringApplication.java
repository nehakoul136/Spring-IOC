package com.nt.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.*;

public class SpringApplication {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User u = (User) context.getBean("user_constructor");
		System.out.println(u.getUser_id()+" "+u.getUser_name());
	
		//System.out.println(e.getId() +" "+e.getName() +" "+e.getSalary() +" "+e.getAdr().getCity() +" "+e.getAdr().getState());		
	}

}
