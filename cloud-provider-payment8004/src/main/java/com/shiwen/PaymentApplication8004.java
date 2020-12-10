package com.shiwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wangjie
 * @Title: PaymentApplication8004
 * @Description: eureka服务提供者
 * @company: 西安石文软件有限公司
 * @date 2020/10/2611:17
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentApplication8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8004.class, args);
    }

}
