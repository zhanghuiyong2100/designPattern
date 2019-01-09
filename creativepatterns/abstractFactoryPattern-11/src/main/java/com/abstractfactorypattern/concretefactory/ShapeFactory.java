package com.abstractfactorypattern.concretefactory;

import com.abstractfactorypattern.abstractfactory.AbstractFactory;
import com.abstractfactorypattern.abstractproduct.Color;
import com.abstractfactorypattern.abstractproduct.Shape;
import com.abstractfactorypattern.product.Circle;
import com.abstractfactorypattern.product.Rectangle;
import com.abstractfactorypattern.product.Square;


/**
 * @author zhanghuiyong
 * @创建时间 2019年01月09日
 * @描述: 具体工厂类-形状功能
 **/

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if ("圆".equals(shapeType)) {
            return new Circle();
        } else if ("矩形".equals(shapeType)) {
            return new Rectangle();
        } else if ("正方形".equals(shapeType)) {
            return new Square();
        }
        return null;
    }
}
