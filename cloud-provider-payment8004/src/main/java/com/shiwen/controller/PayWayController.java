package com.shiwen.controller;

import com.shiwen.entity.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangjie
 * @Title: PayWayController
 * @Description: 网关服务提供者
 * @company: 西安石文软件有限公司
 * @date 2020/10/2611:27
 */
@RestController
@RequestMapping("/payment")
public class PayWayController {

    @Value("${server.port}")
    private  String  serverPort;
    /**
     * 返回成功
     */
    @RequestMapping("/success")
    public CommonResult success(){
        return new CommonResult(200,"访问成功","服务端口号"+serverPort);
    }

    /**
     * 返回成功
     */
    @RequestMapping("/fail")
    public CommonResult fail(){
        return new CommonResult(500,"访问失败","服务端口号"+serverPort);
    }
}
