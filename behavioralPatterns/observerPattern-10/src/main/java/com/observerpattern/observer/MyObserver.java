package com.observerpattern.observer;

import com.observerpattern.subject.Subject;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月08日
 * @描述: 抽象观察者类
 **/
public abstract class MyObserver {

    protected Subject subject;

    public abstract void update();
}
