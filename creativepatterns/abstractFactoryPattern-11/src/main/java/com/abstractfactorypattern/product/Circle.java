package com.abstractfactorypattern.product;

import com.abstractfactorypattern.abstractproduct.Shape;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月09日
 * @描述: 具体产品类-圆
 **/

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画圆");
    }
}
