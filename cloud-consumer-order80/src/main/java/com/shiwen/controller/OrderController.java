package com.shiwen.controller;

import com.shiwen.entity.CommonResult;
import com.shiwen.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author wangjie
 * @Title: OrderController
 * @Description: 订单控制层
 * @company: 西安石文软件有限公司
 * @date 2020/9/2720:22
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    private String URL_PREFIX="http://CLOUD-PAYMENT-SERVICE"; //服务的名字，而不是ip+端口号


    @GetMapping("/getPayMent/{id}")
    public CommonResult getPayMent(@PathVariable Long id){
        Map<String, Object> map = new HashMap<>();
        map.put("id",id);
        String url=this.getUrl(URL_PREFIX+"/payment/select-one",map);
        return restTemplate.getForObject(url, CommonResult.class);
    }

    @PostMapping("/add")
    public CommonResult add(@RequestBody Payment payment){
        return restTemplate.postForObject(URL_PREFIX+"/payment/add",payment,CommonResult.class);

    }



    protected String getUrl(String url, Map<String, Object> params) {
        params = params == null ? new LinkedHashMap<>() : params;
        StringBuilder sb = new StringBuilder(url);
        sb.append("?");
        params.forEach((o1, o2) -> sb.append(o1).append("=").append(o2).append("&"));
        url = sb.toString().substring(0, sb.length() - 1);
        return url;
    }

}
