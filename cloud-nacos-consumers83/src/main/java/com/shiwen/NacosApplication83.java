package com.shiwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangjie
 * @Title: NacosApplication83
 * @Description: nacos消费者
 * @company: 西安石文软件有限公司
 * @date 2020/11/1711:02
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosApplication83 {

    public static void main(String[] args) {
        SpringApplication.run(NacosApplication83.class,args);
    }
}
