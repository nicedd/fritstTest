package eurekaserver.blogeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BlogeurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogeurekaApplication.class, args);
    }

}
