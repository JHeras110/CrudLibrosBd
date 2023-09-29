package com.example.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = "com.example.model")
@EnableJpaRepositories(basePackages = "com.example.dao")
@SpringBootApplication(scanBasePackages={"com.example.controller", "com.example.services"})
public class Crudlibrosbd_remakeApplication {
	public static void main(String[] args) {
		SpringApplication.run(Crudlibrosbd_remakeApplication.class, args);
	}
}
