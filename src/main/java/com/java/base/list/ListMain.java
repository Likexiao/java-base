package com.java.base.list;

import com.java.base.ThreadPractice.Account;


import java.util.ArrayList;
import java.util.Arrays;

public class ListMain {
    public static void main(String[] args)
    {

        UserList user1 = new UserList("demo1",25);
        ArrayList<UserList> arr = new ArrayList<>();
        arr.add(user1);
        assert !arr.isEmpty();
        for (int i =0;i<1000000;i++)
        {
            arr.add(new UserList("demo"+i,i));
        }
        for (UserList u:
             arr) {
            System.out.println("name:"+u.getName());
            System.out.println("age:"+u.getAge());
        }
    }
}
