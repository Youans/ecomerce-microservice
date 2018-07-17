package com.ecomerce.userservice.userservice;

import com.ecomerce.userservice.userservice.model.User;
import com.ecomerce.userservice.userservice.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.Random;
import java.util.stream.Stream;

@SpringBootApplication
@EnableDiscoveryClient
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}


	@Bean CommandLineRunner commandLineRunner(UserRepository userRepository) {
		Random random=new Random();
		return (strings) -> {
			Stream.of("Youans", "Peter", "John", "Alex", "Merna", "Susan").forEach(name -> userRepository.save(new User(random.nextInt(50),name)));

		};

	}

}
