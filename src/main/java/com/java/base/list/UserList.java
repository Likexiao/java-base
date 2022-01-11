package com.java.base.list;

public class UserList {
    private String name;
    private int age;

    public UserList(){
        this.name = "lkx";
        this.age = 24;
    }
    public UserList(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
