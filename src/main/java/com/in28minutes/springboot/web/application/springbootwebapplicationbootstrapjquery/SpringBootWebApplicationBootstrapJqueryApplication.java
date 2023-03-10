package com.in28minutes.springboot.web.application.springbootwebapplicationbootstrapjquery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringBootWebApplicationBootstrapJqueryApplication extends SpringBootServletInitializer {
	
	@GetMapping("/AWS")
	public String HelloAWS()
	{
		return "Hello AWS Application";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplicationBootstrapJqueryApplication.class, args);
	}


}
