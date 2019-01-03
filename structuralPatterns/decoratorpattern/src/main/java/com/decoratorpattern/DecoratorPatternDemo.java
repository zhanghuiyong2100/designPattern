package com.decoratorpattern;

import com.decoratorpattern.component.Shape;
import com.decoratorpattern.concretecomponet.Circle;
import com.decoratorpattern.concretecomponet.Rectangle;
import com.decoratorpattern.concretedecorator.RedShapeDecorator;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月03日
 * @描述: 结构性型模式-装饰器模式-实现类
 **/

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Shape redCircle = new RedShapeDecorator(circle);
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("普通的圆");
        circle.draw();
        System.out.println("红色的圆");
        redCircle.draw();

        System.out.println("红色边框");
        redRectangle.draw();

    }
}
