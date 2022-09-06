package com.example.demo.Service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author 何祖泽
 * @version 1.0
 * @date Create in 2022/8/17 14:51
 * @description TODO
 */
@Component
public class TestPost {
    @PostConstruct//初始化之前对此bean的额外处理
    private void say(){
        System.out.println("哈哈哈");
    }

    public void test(){
        System.out.println("test");
    }
}
