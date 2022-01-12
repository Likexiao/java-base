package com.java.base.desensitizedUtil;

import cn.hutool.core.util.DesensitizedUtil;

public class TestDesensitizedUtil {
    public static void main(String[] args) {
        String mobilePhoneResult = DesensitizedUtil.mobilePhone("15297993532");
        String idCardNumResult = DesensitizedUtil.idCardNum("36030219970221",2,5);
        System.out.println(idCardNumResult);
    }
}
