package com.stackroute.muzixApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan
@SpringBootApplication
public class MuzixAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(MuzixAppApplication.class, args);
	}
}
