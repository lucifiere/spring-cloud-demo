package com.lucifiere.scd.configure;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CommonConfigure {

    @Bean
    @LoadBalanced
    public RestTemplate getClientLBRestTemplate() {
        return new RestTemplate();
    }

}
