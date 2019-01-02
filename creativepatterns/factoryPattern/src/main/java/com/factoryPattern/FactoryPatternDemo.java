package com.factoryPattern;

import com.factoryPattern.Product.Operation;

/**
 * @author zhanghuiyong
 * @创建时间 2018年12月28日
 * @描述: 工厂模式—工厂角色—工厂模式消费者
 **/

public class FactoryPatternDemo {
    public static void main(String[] args) {
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = null;
        try {
            operation = operationFactory.getOperation("+");
            operation.toOperation(1,2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
