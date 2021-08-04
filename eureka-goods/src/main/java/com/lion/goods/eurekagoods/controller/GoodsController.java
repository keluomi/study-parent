package com.lion.goods.eurekagoods.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GoodsController {

    @GetMapping("/")
    public String index(){

        return "欢迎到商品服务！";
    }

    @GetMapping("/getGoods/{id}")
    public Map<String, Object> doOrder(@PathVariable String id){

        System.out.println(System.currentTimeMillis());
        Map<String,Object> goods = new HashMap<>();
        goods.put("id",id);
        goods.put("name","苹果");
        goods.put("price",100);


        return goods;
    }
}
