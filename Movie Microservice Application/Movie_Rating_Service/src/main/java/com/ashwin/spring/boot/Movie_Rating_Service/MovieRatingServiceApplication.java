package com.ashwin.spring.boot.Movie_Rating_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieRatingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRatingServiceApplication.class, args);
	}

}
