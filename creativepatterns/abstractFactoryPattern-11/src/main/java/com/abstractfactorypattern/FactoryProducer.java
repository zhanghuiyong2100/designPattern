package com.abstractfactorypattern;

import com.abstractfactorypattern.abstractfactory.AbstractFactory;
import com.abstractfactorypattern.concretefactory.ColorFactory;
import com.abstractfactorypattern.concretefactory.ShapeFactory;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月09日
 * @描述: 工厂生成器类
 **/

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if ("SHAPE".equals(choice)) {
            return new ShapeFactory();
        }
        if ("COLOR".equals(choice)) {
            return new ColorFactory();
        }
        return null;

    }
}
