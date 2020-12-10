package com.shiwen.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangjie
 * @Title: OpenFeignConfig
 * @Description: feign的日志配置bean
 * @company: 西安石文软件有限公司
 * @date 2020/10/1511:52
 */
@Configuration
public class OpenFeignConfig {

    /**
     * 日志的级别
     * @return
     */
    @Bean
    Logger.Level feignLevel(){
        return Logger.Level.FULL;
    }
}
