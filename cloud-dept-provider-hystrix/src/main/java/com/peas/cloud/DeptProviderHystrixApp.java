package com.peas.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //注册到eureka
@EnableDiscoveryClient  //服务发现
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class DeptProviderHystrixApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrixApp.class,args);
    }
}
