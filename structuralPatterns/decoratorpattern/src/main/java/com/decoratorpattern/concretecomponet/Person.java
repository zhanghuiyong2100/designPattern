package com.decoratorpattern.concretecomponet;

import com.decoratorpattern.component.Component;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月03日
 * @描述: 结构性型模式-装饰器模式-具体构建类-人
 **/

public class Person implements Component {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("装扮的" + name);
    }
}
