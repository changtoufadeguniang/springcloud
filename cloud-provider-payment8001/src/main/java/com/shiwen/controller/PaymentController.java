package com.shiwen.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.shiwen.entity.CommonResult;
import com.shiwen.entity.Payment;
import com.shiwen.service.PaymentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;


/**
 * 支付表(Payment)表控制层
 *
 * @author wangjie
 * @since 2020-09-27 17:19:14
 */

@RestController
@RequestMapping("payment")
public class PaymentController {
    /**
     * 服务对象
     */
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "根据id查询数据")
    @GetMapping("select-one/{id}")
    @HystrixCommand(fallbackMethod = "timeOutMethodAll",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"), //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"), //请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), //时间范围
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"), //失败率达到多少后跳闸
    })
    public CommonResult selectOne(@PathVariable  Long id) {
        if(id<0.0){
           int i=10/0;
           return new CommonResult(200,"成功"+serverPort,"程序出错了");
        }else {
            Payment payment = this.paymentService.queryById(id);
            return new CommonResult(200,"成功"+serverPort,payment);
        }
    }

    /**
     * 增加
     */
    @ApiOperation(value = "添加数据")
    @PostMapping("add")
    public CommonResult addPayment(@RequestBody Payment payment){
        boolean insert = paymentService.insert(payment);
        if(insert==true){
            return new CommonResult(200,"插入成功人不输"+serverPort,true);
        }else{
            return new CommonResult(500,"插入失败"+serverPort,false);
        }
    }

    /**
     * 编写超时程序
     */
    @GetMapping("timeout")
    public CommonResult timeOutMethods(){
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new CommonResult(200,"超时服务",serverPort);
    }

    //兜底的方法
    public  CommonResult timeOutMethodAll(Long id){
        return new CommonResult(200,"系统占时繁忙请稍后重试",serverPort);
    }


}