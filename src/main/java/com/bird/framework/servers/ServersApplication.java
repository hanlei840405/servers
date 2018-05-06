package com.bird.framework.servers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServersApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServersApplication.class, args);
    }
}
