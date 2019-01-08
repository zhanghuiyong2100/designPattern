package com.builderpattern.bulider;

import com.builderpattern.product.Vehicle;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月07日
 * @描述: 创建型模式-建造者模式-抽象建站者-汽车建造者抽象类
 **/

public abstract class VehicleBuilder {
    public Vehicle vehicle;


    /**
     * 构建汽车框架
     */
    abstract public void buildFrame();

    /**
     * 构建汽车引擎
     */
    abstract public void buildEngine();

    /**
     * 构建汽车车轮
     */
    abstract public void buildWheels();

    /**
     * 构建汽车车门
     */
    abstract public void buildDoors();
}
