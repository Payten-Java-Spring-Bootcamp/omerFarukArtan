package com.patika.bootcamp.patikabootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class PatikaBootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatikaBootcampApplication.class, args);
	}

}
