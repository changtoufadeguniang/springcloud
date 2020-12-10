package com.shiwen.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangjie
 * @Title: NacosConfig
 * @Description: nacos配置类
 * @company: 西安石文软件有限公司
 * @date 2020/11/1711:12
 */
@Configuration
public class NacosConfig {

    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


}
