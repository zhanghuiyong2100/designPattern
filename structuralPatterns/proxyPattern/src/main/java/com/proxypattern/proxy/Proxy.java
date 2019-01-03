package com.proxypattern.proxy;

import com.proxypattern.SchoolGirl;
import com.proxypattern.realsubject.Pursuit;
import com.proxypattern.subject.IGiveGift;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月03日
 * @描述: 结构性型模式-代理模式-代理主题角色
 **/

public class Proxy implements IGiveGift {

    private String name;
    Pursuit gg;

    public Proxy(String name, SchoolGirl mm) {
        this.name = name;
        this.gg = new Pursuit("倒霉男", mm);
    }

    @Override
    public void giveDolls() {
        System.out.print("我是" + name + ",帮人带信:");
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        System.out.print("我是" + name + ",帮人带信:");
        gg.giveFlowers();
    }

    @Override
    public void giveChocalate() {
        System.out.print("我是" + name + ",帮人带信:");
        gg.giveChocalate();
    }
}
