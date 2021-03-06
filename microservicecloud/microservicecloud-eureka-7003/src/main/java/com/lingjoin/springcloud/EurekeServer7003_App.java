package com.lingjoin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekeServer7003_App {

    public static void main(String[] args) {
        SpringApplication.run(EurekeServer7003_App.class,args);
        System.out.println("eureka7001启动");
    }
}
