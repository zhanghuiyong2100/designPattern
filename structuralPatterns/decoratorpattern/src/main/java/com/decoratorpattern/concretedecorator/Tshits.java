package com.decoratorpattern.concretedecorator;

import com.decoratorpattern.component.Component;
import com.decoratorpattern.decorator.BaseFinery;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月03日
 * @描述: 结构性型模式-装饰器模式-具体装饰类-T恤类
 **/

public class Tshits extends BaseFinery {
    public Tshits(Component component) {
        super(component);
    }

    @Override
    public void show() {
        System.out.println("穿上T恤");
        component.show();
    }
}
