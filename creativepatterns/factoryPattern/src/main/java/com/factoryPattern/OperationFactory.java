package com.factoryPattern;

import com.factoryPattern.Product.Operation;
import com.factoryPattern.concreteproduct.Addition;
import com.factoryPattern.concreteproduct.Division;
import com.factoryPattern.concreteproduct.Multiplication;
import com.factoryPattern.concreteproduct.Subtraction;

/**
 * @author zhanghuiyong
 * @创建时间 2018年12月28日
 * @描述: 工厂模式—工厂角色—运算工厂类
 **/

public class OperationFactory {
    public Operation getOperation(String strNumberC) {
        switch (strNumberC) {
            case "+":
                return new Addition();
            case "-":
                return new Subtraction();
            case "*":
                return new Multiplication();
            case "/":
                return new Division();
            default:
                return null;
        }
    }
}
