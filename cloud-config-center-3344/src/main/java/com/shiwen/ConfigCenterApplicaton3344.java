package com.shiwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author wangjie
 * @Title: ConfigCenterApplicaton3344
 * @Description: 中心配置服务端
 * @company: 西安石文软件有限公司
 * @date 2020/10/2710:42
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterApplicaton3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterApplicaton3344.class,args);
    }
}
