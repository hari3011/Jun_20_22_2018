package com.gbig;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Day03SpringApplication {

	public static void main(String[] args) {
		PersonsDao personsDao = new PersonsDao();
		try {
			personsDao.insert("Sam", "Thomas", 23);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}
}
