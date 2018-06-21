package com.gbig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//Active Container
		//It loads all the beans on startup
		//You can postpone the instantiation by lazy-init=true
		//All the beans are in singleton scope by default;change the scope by using scope=''
		//Properties can be configured only if setter-method is available
		//If you have a constructor with arguments, it has to be configured
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:masterconfig.xml");
		
		Company company = context.getBean("company",Company.class);
		System.out.println(company.getOffices());
		Player player = context.getBean("player1",Player.class);
		context.getBean("car");
		
		Book book1 = context.getBean("book",Book.class); 
		System.out.println(book1);
		
		Book book2 = context.getBean("book",Book.class); 
		System.out.println(book2);
		
		Book book3 = context.getBean("book",Book.class); 
		System.out.println(book3);
		
		System.out.println("End of Main");
	}

}
