package com.shiwen.controller;

import com.shiwen.entity.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author wangjie
 * @Title: ConsulController
 * @Description: consul测试类
 * @company: 西安石文软件有限公司
 * @date 2020/10/910:44
 */
@RestController
@RequestMapping("/consul")
public class ConsulController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment")
    public CommonResult getPayment(){
        return  new CommonResult(200,"consul"+serverPort, UUID.randomUUID().toString());
    }

}
