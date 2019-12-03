package com.lucifiere.scd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 *
 * @author XD.Wang
 */
@SpringBootApplication
@EnableEurekaServer
public class BaseSupApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseSupApplication.class, args);
    }

}
