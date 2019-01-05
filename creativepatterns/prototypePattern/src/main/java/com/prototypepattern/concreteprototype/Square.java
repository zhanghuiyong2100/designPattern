package com.prototypepattern.concreteprototype;

import com.prototypepattern.prototype.Shape;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月05日
 * @描述: 创建型模型-原型模式-具体原型类-正方形类
 **/

public class Square extends Shape {

    public Square() {
        type = "正方形";
    }

    @Override
    public void draw() {
        System.out.println(type + ":在正方形的画图方法中");
    }
}
