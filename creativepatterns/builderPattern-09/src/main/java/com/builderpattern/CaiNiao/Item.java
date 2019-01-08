package com.builderpattern.CaiNiao;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月07日
 * @描述: 食物条目接口
 **/
public interface Item {
    /**
     * 套餐名字
     */
    public String name();

    /**
     * 食物包装
     */
    public Packing packing();

    /**
     * 价格
     */
    public float price();
}
