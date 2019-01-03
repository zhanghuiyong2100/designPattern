package com.decoratorpattern;

import com.decoratorpattern.component.Component;
import com.decoratorpattern.concretecomponet.Person;
import com.decoratorpattern.concretedecorator.BigTrouser;
import com.decoratorpattern.concretedecorator.Tshits;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月03日
 * @描述: 结构性型模式-装饰器模式-用户类
 **/

public class ClientDemo {
    public static void main(String[] args) {
        Component person = new Person("张三");
        Component personProuser = new BigTrouser(person);
        Component personTshits = new Tshits(person);
        System.out.println("正常");
        person.show();
        System.out.println("裤子");
        personProuser.show();
        System.out.println("T恤");
        personTshits.show();
    }
}
