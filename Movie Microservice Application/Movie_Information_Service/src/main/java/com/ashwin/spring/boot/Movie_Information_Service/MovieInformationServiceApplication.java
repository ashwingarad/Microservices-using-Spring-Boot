package com.ashwin.spring.boot.Movie_Information_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieInformationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInformationServiceApplication.class, args);
	}

}
