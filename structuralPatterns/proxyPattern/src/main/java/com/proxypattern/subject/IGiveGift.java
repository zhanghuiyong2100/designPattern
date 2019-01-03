package com.proxypattern.subject;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月03日
 * @描述: 结构性型模式-代理模式-抽象主题角色类-送礼物
 **/
public interface IGiveGift {
    /**
     * 送布偶
     */
    void giveDolls();

    /**
     * 送鲜花
     */
    void giveFlowers();

    /**
     * 送巧克力
     */
    void giveChocalate();
}
