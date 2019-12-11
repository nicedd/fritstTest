package com.zuul.blog.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class BlogZuulApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BlogZuulApplication.class, args);
    }

}
