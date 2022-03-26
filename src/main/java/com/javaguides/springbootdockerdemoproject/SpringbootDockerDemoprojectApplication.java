package com.javaguides.springbootdockerdemoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerDemoprojectApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Spring Boot docker Demo";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerDemoprojectApplication.class, args);
	}

}
