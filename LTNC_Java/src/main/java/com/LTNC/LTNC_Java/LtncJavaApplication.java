package com.LTNC.LTNC_Java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude  = SecurityAutoConfiguration.class)
public class LtncJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LtncJavaApplication.class, args);
	}

}
