package com.lion.order.eurekaorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/")
    public String index(){

        return "欢迎到订单服务！";
    }

    @GetMapping("/doOrder")
    public Map doOrder(){

        ResponseEntity<HashMap> goods = restTemplate.getForEntity("http://eureka-goods/getGoods/1", HashMap.class);
        return goods.getBody();
    }
}
