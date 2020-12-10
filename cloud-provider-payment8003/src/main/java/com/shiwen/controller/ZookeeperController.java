package com.shiwen.controller;

import com.shiwen.entity.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author wangjie
 * @Title: ZookeeperController
 * @Description: zooker测试
 * @company: 西安石文软件有限公司
 * @date 2020/9/3015:34
 */

@RestController
@RequestMapping("/zook")
public class ZookeeperController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/port")
    public CommonResult getPort(){
        return new CommonResult(200,"成功"+serverPort+ UUID.randomUUID().toString(),String.class);
    }
}
