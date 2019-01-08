package com.builderpattern.CaiNiao;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月07日
 * @描述: 测试
 **/

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareVegMeal();
        System.out.println("原味套餐");
        meal.showItems();
        System.out.println("价格:"+meal.getCost());

        Meal vegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("百事套餐");
        vegMeal.showItems();
        System.out.println("价格:"+vegMeal.getCost());
    }
}
