package com.observerpattern;

import com.observerpattern.concreteobservcer.BinaryObserver;
import com.observerpattern.concreteobservcer.HexaOberver;
import com.observerpattern.concreteobservcer.OctalObserver;
import com.observerpattern.subject.Subject;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月08日
 * @描述: 测试客户端
 **/

public class Demo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaOberver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        subject.notifyAllMyObservers();
        System.out.println("Second state change: 10");
        subject.setState(10);
        subject.notifyAllMyObservers();
    }
}
