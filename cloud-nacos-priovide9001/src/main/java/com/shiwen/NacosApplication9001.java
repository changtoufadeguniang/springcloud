package com.shiwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangjie
 * @Title: NacosApplication9001
 * @Description: nacos服务提供者
 * @company: 西安石文软件有限公司
 * @date 2020/11/1513:23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosApplication9001 {

    public static void main(String[] args) {
        SpringApplication.run(NacosApplication9001.class,args);
    }
}
