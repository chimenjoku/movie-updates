package com.example.MovieUpdates;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MovieUpdatesApplication extends SpringBootServletInitializer {

	private static final Logger log = LoggerFactory.getLogger(MovieUpdatesApplication.class);
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(MovieUpdatesApplication.class, args);
	}

}
