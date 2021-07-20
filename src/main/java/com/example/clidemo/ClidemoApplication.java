package com.example.clidemo;

import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClidemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClidemoApplication.class, args);
		System.out.println("Server Up!");
	}

}
