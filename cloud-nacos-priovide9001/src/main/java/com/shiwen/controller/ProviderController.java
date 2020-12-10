package com.shiwen.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangjie
 * @Title: ProviderController
 * @Description: 服务提供者
 * @company: 西安石文软件有限公司
 * @date 2020/11/1710:34
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/port")
    public String getPort(){
       return "服务的nacos-payment-provider："+serverPort;
    }
}
