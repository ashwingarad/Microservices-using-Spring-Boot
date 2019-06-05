package com.ashwin.spring.boot.Movie_Catalog_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieCatalogServiceApplication {

	@Bean	// For synchronous output
	@LoadBalanced	//Prevent direct access and all request go through discovery-server.
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	@Bean	//For asynchronous output.	Reactive web service.
	@LoadBalanced
	public WebClient.Builder builder(){
		return WebClient.builder();
	}

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogServiceApplication.class, args);
	}

}
