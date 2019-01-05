package com.prototypepattern.concreteprototype;

import com.prototypepattern.prototype.Shape;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月05日
 * @描述: 创建型模型-原型模式-具体原型类-圆形类
 **/

public class Circle extends Shape {

    public Circle() {
        type="圆形";
    }

    @Override
    public void draw() {
        System.out.println(type+":在圆形的画图方法中");
    }
}
