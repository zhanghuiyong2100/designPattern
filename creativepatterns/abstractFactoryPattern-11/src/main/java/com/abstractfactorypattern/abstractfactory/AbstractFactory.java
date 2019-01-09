package com.abstractfactorypattern.abstractfactory;

import com.abstractfactorypattern.abstractproduct.Color;
import com.abstractfactorypattern.abstractproduct.Shape;
/**
 * @author zhanghuiyong
 * @创建时间 2019年01月09日
 * @描述: 创建型模式-抽象工厂模式-抽象工厂类
 **/

public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}