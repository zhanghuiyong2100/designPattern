package com.designpattern.concretestrategy;

import com.designpattern.strategy.CashSuper;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月02日
 * @描述: 返利收费具体策略类
 **/

public class CashReturn extends CashSuper {
    /**
     * 返利条件
     */
    private double moneyCondition = 0.0d;

    /**
     * 返利金额
     */
    private double moneyReturn = 0.0d;

    /**
     * 设置返利条件和金额
     */
    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        if (money >= moneyCondition) {
            return money - moneyReturn;
        }
        return money;
    }
}
