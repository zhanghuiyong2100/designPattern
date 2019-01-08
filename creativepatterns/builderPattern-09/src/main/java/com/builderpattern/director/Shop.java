package com.builderpattern.director;

import com.builderpattern.bulider.VehicleBuilder;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月07日
 * @描述: 指挥者-工厂
 **/

public class Shop {
    public void Construct(VehicleBuilder vehicleBuilder) {
        vehicleBuilder.buildFrame();
        vehicleBuilder.buildEngine();
        vehicleBuilder.buildWheels();
        vehicleBuilder.buildDoors();
    }
}
