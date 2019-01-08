package com.builderpattern.CaiNiao;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月07日
 * @描述: 百事可乐实体类
 **/

public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
