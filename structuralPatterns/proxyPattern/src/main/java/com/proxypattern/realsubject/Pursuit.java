package com.proxypattern.realsubject;

import com.proxypattern.SchoolGirl;
import com.proxypattern.subject.IGiveGift;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月03日
 * @描述: 结构性型模式-代理模式-真是主题角色类
 **/

public class Pursuit implements IGiveGift {
    private String name;
    private SchoolGirl mm;

    public Pursuit(String name, SchoolGirl mm) {
        this.name = name;
        this.mm = mm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + "我是" + name + ",送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + "我是" + name + ",送你鲜花");
    }

    @Override
    public void giveChocalate() {
        System.out.println(mm.getName() + "我是" + name + ",送你巧克力");

    }
}
