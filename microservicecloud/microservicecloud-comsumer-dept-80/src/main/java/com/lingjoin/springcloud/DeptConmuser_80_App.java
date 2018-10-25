package com.lingjoin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptConmuser_80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConmuser_80_App.class,args);
    }
}
