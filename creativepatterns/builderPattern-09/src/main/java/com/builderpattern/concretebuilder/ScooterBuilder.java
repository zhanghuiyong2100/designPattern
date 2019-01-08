package com.builderpattern.concretebuilder;

import com.builderpattern.bulider.VehicleBuilder;
import com.builderpattern.product.Vehicle;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月07日
 * @描述: 具体制造者-滑板车制造商
 **/

public class ScooterBuilder extends VehicleBuilder {

    @Override
    public void buildFrame() {
        vehicle = new Vehicle("滑板车");
        vehicle.addParts("框架", "滑板车");
    }

    @Override
    public void buildEngine() {
        vehicle.addParts("引擎","滑板车引擎");
    }

    @Override
    public void buildWheels() {
        vehicle.addParts("车轮","4");
    }

    @Override
    public void buildDoors() {
        vehicle.addParts("车门","0");
    }
}
