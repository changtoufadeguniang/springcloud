package com.shiwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangjie
 * @Title: ProviderApplication
 * @Description: 服务提供方
 * @company: 西安石文软件有限公司
 * @date 2020/9/2715:02
 */
@SpringBootApplication
@EnableDiscoveryClient //这个可以获取服务的相关信息
public class ProviderApplication8003 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication8003.class, args);
    }
}
