package com.example.demo.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private Integer id;
    private String name;
    private List hobby;
    private String[] family;
    private Pet pet;
    private Map map;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHobby(List hobby) {
        this.hobby = hobby;
    }

    public void setFamily(String[] family) {
        this.family = family;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Pet getPet() {
        return pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobby=" + hobby +
                ", family=" + Arrays.toString(family) +
                ", pet=" + pet +
                ", map=" + map +
                '}';
    }
}
