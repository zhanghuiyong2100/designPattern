package com.abstractfactorypattern.product;

import com.abstractfactorypattern.abstractproduct.Color;
/**
 * @author zhanghuiyong
 * @创建时间 2019年01月09日
 * @描述: 具体产品类-蓝色
 **/
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("涂蓝");
    }
}