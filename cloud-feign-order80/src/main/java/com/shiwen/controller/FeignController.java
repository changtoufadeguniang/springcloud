package com.shiwen.controller;

import com.shiwen.entity.CommonResult;
import com.shiwen.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangjie
 * @Title: FeignController
 * @Description: openfeign服务的调用
 * @company: 西安石文软件有限公司
 * @date 2020/10/1411:13
 */
@RestController
@RequestMapping("/order")
//@DefaultProperties(defaultFallback = "globalTimeOutMethod")
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/selete/{id}")
    public CommonResult getUserById(@PathVariable Long id){
        return feignService.selectOne(id);
    }

    @GetMapping("/timeout")

    public CommonResult getTimeOut(){
        return feignService.timeOutMethods();
    }


    public CommonResult orderTimeOutMethod(){
        return new CommonResult(200,"消费端兜底的方法","===================");
    }

    public CommonResult globalTimeOutMethod(){
        return new CommonResult(200,"消费端全局的兜底方法","=====================");
    }
}
