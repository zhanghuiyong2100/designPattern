package com.builderpattern;

import com.builderpattern.concretebuilder.CarBuilder;
import com.builderpattern.concretebuilder.MotorCycleBuilder;
import com.builderpattern.concretebuilder.ScooterBuilder;
import com.builderpattern.director.Shop;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月07日
 * @描述: 客户端
 **/

public class Program {
    public static void main(String[] args) {
        Shop shop = new Shop();
        ScooterBuilder scooterBuilder = new ScooterBuilder();
        shop.Construct(scooterBuilder);
        MotorCycleBuilder motorCycleBuilder = new MotorCycleBuilder();
        shop.Construct(motorCycleBuilder);
        CarBuilder carBuilder = new CarBuilder();
        shop.Construct(carBuilder);
        scooterBuilder.vehicle.showParts();
        motorCycleBuilder.vehicle.showParts();
        carBuilder.vehicle.showParts();
    }
}
