package com.shiwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangjie
 * @Title: ProviderConsulApplication8005
 * @Description: consul服务治理
 * @company: 西安石文软件有限公司
 * @date 2020/10/910:28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderConsulApplication8005 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderConsulApplication8005.class,args);
    }
}
