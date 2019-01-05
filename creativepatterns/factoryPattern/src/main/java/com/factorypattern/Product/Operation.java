package com.factorypattern.Product;

/**
 * @author zhanghuiyong
 * @创建时间 2018年12月28日
 * @描述: 简单工厂模式——抽象产品角色-运算接口
 **/
public interface Operation {
    /**
     * <p> 运算方法 </p>
     */
    void toOperation(Integer numberA,Integer numberB);
}
