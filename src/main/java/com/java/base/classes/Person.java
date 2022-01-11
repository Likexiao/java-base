package com.java.base.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private int age;
//    Person(String name,int age){
//        this.name = name;
//        this.age = age;
//
//    }
}
