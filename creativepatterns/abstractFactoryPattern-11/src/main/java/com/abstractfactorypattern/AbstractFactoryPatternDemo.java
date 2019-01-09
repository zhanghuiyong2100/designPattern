package com.abstractfactorypattern;

import com.abstractfactorypattern.abstractfactory.AbstractFactory;
import com.abstractfactorypattern.abstractproduct.Color;
import com.abstractfactorypattern.abstractproduct.Shape;
import org.junit.Test;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月09日
 * @描述: 客户端
 **/

public class AbstractFactoryPatternDemo {
    @Test
    public void TestDemoA() {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shapeA = shapeFactory.getShape("圆");
        shapeA.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color = colorFactory.getColor("红色");
        color.fill();
    }
}
