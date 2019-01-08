package com.observerpattern.concreteobservcer;

import com.observerpattern.observer.MyObserver;
import com.observerpattern.subject.Subject;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月08日
 * @描述: 具体观察者类
 **/

public class BinaryObserver extends MyObserver {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String:" + Integer.toString(subject.getState()));
    }
}
