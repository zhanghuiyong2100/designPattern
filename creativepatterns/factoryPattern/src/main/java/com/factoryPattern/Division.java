package com.factoryPattern;

/**
 * @author zhanghuiyong
 * @创建时间 2018年12月28日
 * @描述: 工厂模式-具体产品角色-除法运算
 **/

public class Division implements Operation {
    @Override
    public void toOperation(Integer numberA, Integer numberB) {
        System.out.println("这是除法运算:结果为"+(numberA/numberB));
    }
}