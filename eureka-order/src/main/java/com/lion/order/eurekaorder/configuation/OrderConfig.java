package com.lion.order.eurekaorder.configuation;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class OrderConfig {


    @LoadBalanced
    @Bean
    RestTemplate initRestTemplate(){
        return new RestTemplate();
    }


}
