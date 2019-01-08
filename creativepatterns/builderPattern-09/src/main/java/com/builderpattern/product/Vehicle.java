package com.builderpattern.product;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月07日
 * @描述: 创建型模式-建造者模式-产品角色-汽车产品角色类
 **/

public class Vehicle {
    /**
     * 类型
     */
    private String type;
    private Map<String, Object> parts = new HashMap<>();


    public void addParts(String part, String Model) {
        parts.put(part, Model);
    }

    public void showParts() {
        System.out.println("这是" + type + "查看构造:");
        for (String s : parts.keySet()) {
            System.out.println("部件:" + s + "型号:" + parts.get(s));
        }
    }

    public Vehicle() {
    }

    public Vehicle(String type) {
        this.type = type;
    }
}
