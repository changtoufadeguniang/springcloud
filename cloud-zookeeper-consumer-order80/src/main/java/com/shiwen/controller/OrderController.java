package com.shiwen.controller;

import com.shiwen.entity.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangjie
 * @Title: OrderController
 * @Description: 订单控制层
 * @company: 西安石文软件有限公司
 * @date 2020/9/2720:22
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    private String URL_PREFIX="http://cloud-payment-service"; //服务的名字，而不是ip+端口号

    @GetMapping("/get-zook")
    public CommonResult getZookeeper(){
        return restTemplate.getForObject(URL_PREFIX+"/zook/port",CommonResult.class);
    }



}
