package com.shiwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wangjie
 * @Title: GetWayApplication
 * @Description: 网关的启动类
 * @company: 西安石文软件有限公司
 * @date 2020/10/2611:10
 */
@SpringBootApplication
@EnableEurekaClient
public class GetWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GetWayApplication.class,args);
    }
}
