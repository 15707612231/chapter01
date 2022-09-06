package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author 何祖泽
 * @version 1.0
 * @date Create in 2022/7/29 14:56
 * @description TODO
 */
@ConfigurationProperties(prefix = "test")
@Component
public class ValueConfig {
    private String password;

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
