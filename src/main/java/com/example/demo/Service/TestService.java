package com.example.demo.Service;

import com.example.demo.config.ValueConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 何祖泽
 * @version 1.0
 * @date Create in 2022/7/28 22:36
 * @description TODO
 */

public class TestService {
//    @Value("${test.password}")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TestService(String password) {
        this.password = password;
    }
    public void test(){
        System.out.println(password);
    }
    public void say(){
        System.out.println("hahaha say");
        System.out.println("say hello");
        System.out.println("hezuze");
        System.out.println("hezuze222");
        System.out.println("pull test");
        System.out.println("hezuze push");
    }
}
