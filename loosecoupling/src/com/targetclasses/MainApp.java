package com.targetclasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.businessclasses.flipcart;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("resources/spring.xml");
		flipcart f=(flipcart)app.getBean("flipcart");
		String bill=f.purchase(new String[] {"clothes,mobiles"});
		System.out.println(bill);
		
		
	}
	
}
