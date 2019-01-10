package com.mementopattern;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月10日
 * @描述: 行为模式-备忘录模式-游戏角色类
 **/

public class GameRolr {
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


    @Override
    public String toString() {
        return "角色当前状态:" +
                "体力=" + vit +
                ", 攻击力=" + atk +
                ", 防御力=" + def +
                '}';
    }


    /**
     * 保存角色状态
     */
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }


    /**
     * 恢复角色状态
     */
    public void recoveryState(RoleStateMemento memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    /**
     * 状态显示
     */
    public void stateDisplay() {
        System.out.println("角色当前状态:\n" +
                "体力=" + this.vit +
                "\n攻击力=" + this.atk +
                "\n防御力=" + this.def
        );
    }

    /**
     * 获得初始状态
     */
    public void getInitState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    /**
     * 战斗
     */
    public void Fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }


    /**
     * get  set
     */
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
