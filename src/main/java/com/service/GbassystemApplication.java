package com.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling //该注解是开启定时任务的支持
public class GbassystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(GbassystemApplication.class, args);
	}
}
