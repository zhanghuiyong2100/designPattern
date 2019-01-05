package com.factorypattern.concreteproduct;

import com.factorypattern.Product.Operation;

/**
 * @author zhanghuiyong
 * @创建时间 2018年12月28日
 * @描述: 简单工厂模式-具体产品角色-加法运算
 **/

public class Addition implements Operation {
    @Override
    public void toOperation(Integer numberA, Integer numberB) {
        System.out.println("这是加法运算:结果为"+(numberA+numberB));
    }
}
