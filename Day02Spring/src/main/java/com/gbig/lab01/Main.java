package com.gbig.lab01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:lab01.xml");
		Conference conference = context.getBean("conference",Conference.class);
		System.out.println(conference.get45MinTopics());
		System.out.println(conference.get50MinTopics());
		System.out.println(conference.get60MinTopics());
	}

}
