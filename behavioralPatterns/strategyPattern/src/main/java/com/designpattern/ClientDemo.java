package com.designpattern;

import com.designpattern.context.CashContrxt;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月02日
 * @描述: 行为型模式-策略模式-抽象策略类-客户类
 **/

public class ClientDemo {

    public static void main(String[] args) {
        demoType("打八折", 300d);
        demoType("满300返100", 300d);
        demoType("正常收费", 300d);
    }

    /**
     * <p>  </p>
     *
     * @param type  活动方式
     * @param money 消费金额
     * @return
     * @其它信息
     */
    public static void demoType(String type, double money) {
        CashContrxt contrxt = new CashContrxt(type);
        double total = contrxt.getResult(money);
        System.out.println(type + "活动,应付金额:" + total);
    }
}
