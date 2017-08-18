package com.hh.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootAdminRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminRegistryApplication.class, args);
    }
}
