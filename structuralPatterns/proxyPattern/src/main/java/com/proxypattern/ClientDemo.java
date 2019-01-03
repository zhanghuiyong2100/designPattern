package com.proxypattern;

import com.proxypattern.proxy.Proxy;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月03日
 * @描述: 客户
 **/

public class ClientDemo {
    public static void main(String[] args) {
        SchoolGirl girl = new SchoolGirl("玳瑜");
        Proxy proxy = new Proxy("圭臬", girl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocalate();


    }
}
