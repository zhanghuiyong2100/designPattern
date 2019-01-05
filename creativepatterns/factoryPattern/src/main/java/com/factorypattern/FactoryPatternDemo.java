package com.factorypattern;

import com.factorypattern.Product.Operation;
import com.factorypattern.concretecreator.SubFactory;
import com.factorypattern.creator.IOperationFactory;

/**
 * @author zhanghuiyong
 * @创建时间 2018年12月28日
 * @描述: 简单工厂模式—工厂角色—工厂模式消费者
 **/

public class FactoryPatternDemo {
    public static void main(String[] args) {
        /** 简单工厂模式  */
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = null;
        try {
            operation = operationFactory.getOperation("+");
            operation.toOperation(1, 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        /** ====================华丽分割线==========================  */
        /** 工厂方法模式  */
        //减法
        IOperationFactory subFactory = new SubFactory();
        Operation subFactoryOperation = subFactory.getOperation();
        subFactoryOperation.toOperation(1, 2);


    }
}
