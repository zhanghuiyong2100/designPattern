package com.designpattern.strategy;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月02日
 * @描述: 行为型模式-策略模式-抽象策略类-打折活动抽象类
 **/

public abstract class CashSuper {

    /**
     * <p> 策略模式，计算活动的消费金额 </p>
     *
     * @param money 活动金额
     * @return
     * @其它信息
     */
    public abstract double acceptCash(double money);
}
