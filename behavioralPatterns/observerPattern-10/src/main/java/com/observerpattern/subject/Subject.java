package com.observerpattern.subject;

import com.observerpattern.observer.MyObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月08日
 * @描述: 行为型模式-观察者模式-目标类-
 **/

public class Subject {
    private List<MyObserver> myObservers = new ArrayList<>();

    private Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }


    public void attach(MyObserver myObserver) {
        myObservers.add(myObserver);
    }

    public void notifyAllMyObservers() {
        for (MyObserver myObserver : myObservers) {
            myObserver.update();
        }
    }
}
