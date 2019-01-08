package com.builderpattern.concretebuilder;

import com.builderpattern.bulider.VehicleBuilder;
import com.builderpattern.product.Vehicle;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月07日
 * @描述: 具体制造者-汽车制造商
 **/

public class CarBuilder extends VehicleBuilder {

    @Override
    public void buildFrame() {
        vehicle = new Vehicle("汽车");
        vehicle.addParts("框架", "汽车");
    }

    @Override
    public void buildEngine() {
        vehicle.addParts("引擎","汽车引擎");
    }

    @Override
    public void buildWheels() {
        vehicle.addParts("车轮","4");
    }

    @Override
    public void buildDoors() {
        vehicle.addParts("车门","4");

    }
}
