package com.codecool.posterlikemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PosterLikeMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PosterLikeMicroserviceApplication.class, args);
    }

}
