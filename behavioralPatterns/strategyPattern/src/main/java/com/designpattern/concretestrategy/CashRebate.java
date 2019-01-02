package com.designpattern.concretestrategy;

import com.designpattern.strategy.CashSuper;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月02日
 * @描述: 行为型模式-策略模式-抽象策略类-打折收费具体策略类
 **/

public class CashRebate extends CashSuper {
    /**
     * 打折折扣
     */
    private double moneyRebate = 1d;

    /**
     * 设置打折折扣
     */
    public CashRebate(String monetRebate) {
        this.moneyRebate = Double.parseDouble(monetRebate);
    }

    public CashRebate() {
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
