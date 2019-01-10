package com.mementopattern;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月10日
 * @描述: 角色状态管理者
 **/

public class RoleStateCaretaker {
    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}
