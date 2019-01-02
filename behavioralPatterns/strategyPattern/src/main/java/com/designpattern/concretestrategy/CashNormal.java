package com.designpattern.concretestrategy;

import com.designpattern.strategy.CashSuper;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月02日
 * @描述: 行为型模式-策略模式-抽象策略类-正常消费具体策略类
 **/

public class CashNormal extends CashSuper {

    /**
     * <p> 正常消费 </p>
     *
     * @param money 原价
     * @return money 活动后金额
     * @其它信息
     */
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
