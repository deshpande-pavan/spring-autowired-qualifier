package com.autowiring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Human human= context.getBean("humanObj", Human.class);
		human.startPumping();
		context.close();
	}

}
