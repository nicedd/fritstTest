package com.blog.blogadminprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@ComponentScan(basePackages = "com.blog")
public class BlogAdminProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogAdminProviderApplication.class, args);
    }

}
