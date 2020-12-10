package com.shiwen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author wangjie
 * @Title: ProviderApplication
 * @Description: 服务提供方
 * @company: 西安石文软件有限公司
 * @date 2020/9/2715:02
 */
@SpringBootApplication
@MapperScan("com.shiwen.dao")
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
