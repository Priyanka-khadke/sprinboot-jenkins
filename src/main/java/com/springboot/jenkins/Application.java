package com.springboot.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static Logger log = LoggerFactory.getLogger(Application.class);

	public void init(){
		log.info("Welcome to application");
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		log.info("application executed successfully");
	}

}
