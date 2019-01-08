package com.builderpattern.CaiNiao;


import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月07日
 * @描述: 套餐模板类
 **/

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * 套餐总金额
     */
    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("食物名:" + item.name());
            System.out.println("包装类型:" + item.packing().pack());
            System.out.println("食物价格:" + item.price());
        }
    }
}
