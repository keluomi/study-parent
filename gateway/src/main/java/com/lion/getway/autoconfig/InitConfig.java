package com.lion.getway.autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


@Configuration
public class InitConfig implements ApplicationRunner {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        ResponseEntity<String> goods = restTemplate.getForEntity("http://eureka-goods/info", String.class);
        String str = goods.getBody();
        System.out.println("***************:"+str);
    }
}
