package com.gbig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {

	public static void main(String[] args) {
		//Is the Container
		//new FileSystemXmlApplicationContext("bin/beans.xml");
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
		Door door = (Door)context.getBean("door2");
		door.open();
		door.close();
	}

}
