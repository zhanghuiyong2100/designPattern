package com.designpattern.context;

import com.designpattern.concretestrategy.CashNormal;
import com.designpattern.concretestrategy.CashRebate;
import com.designpattern.concretestrategy.CashReturn;
import com.designpattern.strategy.CashSuper;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月02日
 * @描述: 活动性模式-策略模式-环境类-商场收费类
 **/

public class CashContrxt {
    /**
     * 打折活动抽象类
     */
    private CashSuper cs;

    /**
     * 通过构造方法，传入具体的收费策略
     */
    public CashContrxt(String type) {
        switch (type) {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300返100":
                cs = new CashReturn("300", "100");
                break;
            case "打八折":
                cs = new CashRebate("0.8");
                break;

        }
    }

    /**
     * 获取收取金额
     */
    public double getResult(double money) {
        //根据收费策略，获取最后的收费金额
        return cs.acceptCash(money);
    }
}
