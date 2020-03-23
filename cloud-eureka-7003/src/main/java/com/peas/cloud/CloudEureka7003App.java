package com.peas.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEureka7003App {
    public static void main(String[] args) {
        SpringApplication.run(CloudEureka7003App.class,args);
    }
}
