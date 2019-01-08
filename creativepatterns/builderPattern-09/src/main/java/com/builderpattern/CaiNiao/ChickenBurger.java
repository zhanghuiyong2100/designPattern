package com.builderpattern.CaiNiao;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月07日
 * @描述: 鸡肉汉堡类
 **/

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
