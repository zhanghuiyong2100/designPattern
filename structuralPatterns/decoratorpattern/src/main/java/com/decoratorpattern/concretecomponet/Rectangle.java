package com.decoratorpattern.concretecomponet;

import com.decoratorpattern.component.Shape;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月03日
 * @描述: 结构性型模式-装饰器模式-具体构建类-方框
 **/

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画个形状:边框");
    }
}
