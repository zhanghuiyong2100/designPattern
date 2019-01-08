package com.builderpattern.CaiNiao;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月07日
 * @描述: 汉堡抽象类
 **/

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
