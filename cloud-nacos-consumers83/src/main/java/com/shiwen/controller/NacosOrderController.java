package com.shiwen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangjie
 * @Title: NacosOrderController
 * @Description: 消费者
 * @company: 西安石文软件有限公司
 * @date 2020/11/1711:15
 */
@RestController
@RequestMapping("/constomer")
public class NacosOrderController {

    @Value("${service-url.nacos-priovider-servic}")
    private String serverUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/port")
    public String getPort(){
        return restTemplate.getForObject(serverUrl + "/provider/port", String.class);
    }
}
