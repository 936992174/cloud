package com.peas.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //注册到eureka
@EnableDiscoveryClient  //服务发现
public class DeptProvider8002App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002App.class,args);
    }
}
