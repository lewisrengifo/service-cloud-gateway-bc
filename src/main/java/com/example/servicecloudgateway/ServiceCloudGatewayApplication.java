package com.example.servicecloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceCloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCloudGatewayApplication.class, args);
    }

}
