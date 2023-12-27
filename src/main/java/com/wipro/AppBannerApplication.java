package com.wipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppBannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppBannerApplication.class, args);
		System.out.println("Application Banner!!");
	}

}
