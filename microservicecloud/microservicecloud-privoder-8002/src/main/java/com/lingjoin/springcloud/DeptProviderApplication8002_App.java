package com.lingjoin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class DeptProviderApplication8002_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderApplication8002_App.class,args);
    }


}
