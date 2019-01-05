package com.factorypattern.creator;

import com.factorypattern.Product.Operation;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月05日
 * @描述: 工厂方法模式—抽象工厂角色-工厂接口
 **/
public interface IOperationFactory {
    public Operation getOperation();
}
