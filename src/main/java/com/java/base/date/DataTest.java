package com.java.base.date;

import cn.hutool.core.date.DateUtil;

import java.util.Calendar;
import java.util.Date;
public class DataTest {
    public static void main(String[] args) {
//        Date date = DateUtil.date();
//        int year = DateUtil.year(date);
//        int month = DateUtil.month(date);
//        int day = DateUtil.dayOfMonth(date);
//        System.out.println("现在时间是：" + year + "年" + month + "月" + day + "日");
        Calendar calendar = DateUtil.calendar();
        System.out.println(calendar.getFirstDayOfWeek());
    }
}
