package com.maticuad.volleyballApp;

import com.maticuad.volleyballApp.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class VolleyballAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(VolleyballAppApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserRepository userRepository, PasswordEncoder encoder) {
		return args -> {

		};
	}
}
