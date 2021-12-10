package com.tf4beta.ems.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@ComponentScan(basePackageClasses=EmployeeController.class)
public class EmsCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsCrudApplication.class, args);
	}

}
