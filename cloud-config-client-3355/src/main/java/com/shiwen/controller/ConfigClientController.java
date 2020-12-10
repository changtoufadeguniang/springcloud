package com.shiwen.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangjie
 * @Title: ConfigClientController
 * @Description: 客户端获得服务端的信息
 * @company: 西安石文软件有限公司
 * @date 2020/10/2711:17
 */
@RestController
@RequestMapping("/client")
@RefreshScope
public class ConfigClientController {


    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/getConfigInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
