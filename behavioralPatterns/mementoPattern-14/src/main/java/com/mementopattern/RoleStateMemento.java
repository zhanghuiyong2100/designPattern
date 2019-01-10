package com.mementopattern;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月10日
 * @描述: 角色状态存储箱
 **/

public class RoleStateMemento {
    /**
     * 生命值
     */
    private Integer vit;
    /**
     * 攻击力
     */
    private Integer atk;
    /**
     * 防御力
     */
    private Integer def;

    public RoleStateMemento() {
    }

    public RoleStateMemento(Integer vit, Integer atk, Integer def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public Integer getVit() {
        return vit;
    }

    public void setVit(Integer vit) {
        this.vit = vit;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }
}
