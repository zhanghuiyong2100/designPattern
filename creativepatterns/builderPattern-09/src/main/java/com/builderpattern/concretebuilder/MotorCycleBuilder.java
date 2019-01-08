package com.builderpattern.concretebuilder;

import com.builderpattern.bulider.VehicleBuilder;
import com.builderpattern.product.Vehicle;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月07日
 * @描述: 具体制造者-摩托车制造商
 **/

public class MotorCycleBuilder extends VehicleBuilder {


    @Override
    public void buildFrame() {
        vehicle = new Vehicle("摩托车");
        vehicle.addParts("框架", "摩托车");
    }

    @Override
    public void buildEngine() {
        vehicle.addParts("引擎","摩托车引擎");
    }

    @Override
    public void buildWheels() {
        vehicle.addParts("车轮","2");
    }

    @Override
    public void buildDoors() {
        vehicle.addParts("车门","0");

    }
}
