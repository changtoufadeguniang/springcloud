package com.shiwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wangjie
 * @Title: EurekaSever2Application
 * @Description: eureka注册中心2
 * @company: 西安石文软件有限公司
 * @date 2020/9/2910:10
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaSever2Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaSever2Application.class,args);
    }
}
