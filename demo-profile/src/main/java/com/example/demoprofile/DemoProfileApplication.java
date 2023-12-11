package com.example.demoprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProfileApplication {

	@Value{app.name}")
	private String name;
	@Bean @Profile("db")
	public ApplicationRunner runner(){
		return r ->{
			System.out.println("AppName::" + name);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoProfileApplication.class, args);
	}

}
