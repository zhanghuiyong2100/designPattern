package com.builderpattern.CaiNiao;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月07日
 * @描述: 包装接口-瓶子类
 **/

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "瓶子";
    }
}
