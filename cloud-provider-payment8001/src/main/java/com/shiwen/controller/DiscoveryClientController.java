package com.shiwen.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



/**
 * @author wangjie
 * @Title: DiscoveryClientController
 * @Description: 使用DiscoveryClient发现服务
 * @company: 西安石文软件有限公司
 * @date 2020/9/2817:25
 */
@RestController
@RequestMapping("/actuator")
public class DiscoveryClientController {

    private static Logger logger = LoggerFactory.getLogger(DiscoveryClientController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/info")
    public Object getDiscoveryClient() {
        StringBuilder sb = new StringBuilder();
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            logger.info("service=" + service);
        }
        String serviceId = "CLOUD-PAYMENT-SERVICE";
        List<ServiceInstance> instances = discoveryClient.getInstances(serviceId);
        for (ServiceInstance instance : instances) {
            sb.append(instance.getServiceId()).append("\t").append(instance.getHost()).append("\t")
                    .append(instance.getPort()).append("\t").append(instance.getUri());
            logger.info("instance=" + sb);
        }
        return sb;
    }

}
