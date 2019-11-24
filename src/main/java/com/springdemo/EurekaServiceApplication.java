package com.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication {

	public static void main(String[] args) {
 	System.out.println("This is for test");
        System.out.println("This is for test");
        SpringApplication.run(EurekaServiceApplication.class, args);
	System.out.println("This is for test");
    }

}
