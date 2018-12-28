package com.factoryPattern;

/**
 * @author zhanghuiyong
 * @创建时间 2018年12月28日
 * @描述: 工厂模式——抽象产品角色-运算接口
 **/
public interface Operation {
    /**
     * <p> 运算方法 </p>
     */
    void toOperation(Integer numberA,Integer numberB);
}
