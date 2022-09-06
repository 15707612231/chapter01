package com.example.demo;

import com.example.demo.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired  //spring容器中取出person对象
    private Person person;


    @Test
    void person() {
        System.out.println(person.toString());
    }

    @Test
    void list(){
        int[] a={1,2,3,4,5};
        for (int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
}
