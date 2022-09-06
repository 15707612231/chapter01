package com.example.demo.config;

import com.example.demo.Service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 何祖泽
 * @version 1.0
 * @date Create in 2022/7/28 22:37
 * @description TODO
 */
@Configuration
public class serviceConfig {
//    @Bean
//    public TestService testService1(){
//        return new TestService();
//    }
    @Bean
    @Profile("dev")
    public TestService testService(){
        return new TestService("hhh");
    }

    @Bean
    @Profile("prod")
    public TestService testServiceProd(){
        return new TestService("prod");
    }

}
