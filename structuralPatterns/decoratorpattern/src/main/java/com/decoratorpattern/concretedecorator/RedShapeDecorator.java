package com.decoratorpattern.concretedecorator;

import com.decoratorpattern.component.Shape;
import com.decoratorpattern.decorator.ShapeDecorator;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月03日
 * @描述: 结构性型模式-装饰器模式-具体装饰类-红色图形装饰类
 **/

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("该图形是红色的");
    }
}
