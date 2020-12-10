package com.shiwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangjie
 * @Title: OrderApplication
 * @Description: 消费者服务
 * @company: 西安石文软件有限公司
 * @date 2020/9/2720:17
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZookeeperApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderZookeeperApplication.class,args);
    }
}
