package com.shiwen.service;

import com.shiwen.entity.CommonResult;
import com.shiwen.service.impl.FeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author wangjie
 * @Title: FeignService
 * @Description: feign接口
 * @company: 西安石文软件有限公司
 * @date 2020/10/1411:19
 */

@FeignClient(value = "CLOUD-PAYMENT-SERVICE",fallback = FeignServiceImpl.class)
public interface FeignService {

    @GetMapping("payment/select-one/{id}")
    CommonResult selectOne(@PathVariable("id") Long id);


    @GetMapping("payment/timeout")
    CommonResult timeOutMethods();


}
