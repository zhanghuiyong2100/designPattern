package com.builderpattern.CaiNiao;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月07日
 * @描述: VegBurger (无肉汉堡类)
 **/

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "原味汉堡";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
