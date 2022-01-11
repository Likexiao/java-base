package com.java.base.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {
    public static void main(String[] args) {
        try {
            //序列化
            Person person = new Person("lkx",24,"奉贤图书馆");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("testSerializables.txt"));
            objectOutputStream.writeObject(person);

            //反序列化
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("testSerializables.txt"));
            Person person1 = (Person) objectInputStream.readObject();
            System.out.println(person1.getAddress());
            System.out.println(person1.getName());
            System.out.println(person1.getAge());
        }catch (Exception e){
        e.printStackTrace();
            System.out.println("error");
        }
    }
}
