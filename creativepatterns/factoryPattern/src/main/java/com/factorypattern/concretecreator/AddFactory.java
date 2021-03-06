package com.factorypattern.concretecreator;

import com.factorypattern.Product.Operation;
import com.factorypattern.concreteproduct.Addition;
import com.factorypattern.creator.IOperationFactory;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月05日
 * @描述: 工厂方法模式—真实工厂角色-加法工厂类
 **/

public class AddFactory implements IOperationFactory {
    @Override
    public Operation getOperation() {
        return new Addition();
    }
}
