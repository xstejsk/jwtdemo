package com.example.jwtdemo;

import com.example.jwtdemo.domain.Role;
import com.example.jwtdemo.domain.User;
import com.example.jwtdemo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class JwtdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtdemoApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null, "John Doe0", "John", "123", new ArrayList<>()));
			userService.saveUser(new User(null, "John Doe1", "John1", "123", new ArrayList<>()));
			userService.saveUser(new User(null, "John Doe2", "John2", "123", new ArrayList<>()));
			userService.saveUser(new User(null, "John Doe3", "John3", "123", new ArrayList<>()));
			userService.saveUser(new User(null, "John Doe4", "John4", "123", new ArrayList<>()));

		};
	}
}
