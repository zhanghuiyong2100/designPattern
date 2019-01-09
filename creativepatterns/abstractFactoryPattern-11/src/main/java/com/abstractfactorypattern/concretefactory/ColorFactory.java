package com.abstractfactorypattern.concretefactory;

import com.abstractfactorypattern.abstractfactory.AbstractFactory;
import com.abstractfactorypattern.abstractproduct.Color;
import com.abstractfactorypattern.abstractproduct.Shape;
import com.abstractfactorypattern.product.*;


/**
 * @author zhanghuiyong
 * @创建时间 2019年01月09日
 * @描述: 具体工厂类-颜色功能
 **/

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String colorType) {
        if ("蓝色".equals(colorType)) {
            return new Blue();
        } else if ("红色".equals(colorType)) {
            return new Red();
        } else if ("绿色".equals(colorType)) {
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {

        return null;
    }
}
