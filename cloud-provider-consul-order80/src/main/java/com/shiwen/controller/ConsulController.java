package com.shiwen.controller;

import com.shiwen.entity.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangjie
 * @Title: ConsulController
 * @Description: 调用
 * @company: 西安石文软件有限公司
 * @date 2020/10/911:57
 */
@RestController
@RequestMapping("/order")
public class ConsulController {

    private String sonsulUrl="http://server-provider-consul";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/info")
    public CommonResult getCommonInfor(){
       return restTemplate.getForObject(sonsulUrl+"/consul/payment",CommonResult.class);
    }
}
