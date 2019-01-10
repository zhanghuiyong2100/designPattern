package com.mementopattern;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月10日
 * @描述: 测试
 **/

public class Demo {
    public static void main(String[] args) {
        GameRolr lixaoyao = new GameRolr();
        lixaoyao.getInitState();
        lixaoyao.stateDisplay();


        //保存进度
        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        RoleStateMemento roleStateMemento = lixaoyao.saveState();

        stateAdmin.setMemento(roleStateMemento);

        //大战boo,损失严重
        lixaoyao.Fight();
        lixaoyao.stateDisplay();

        //恢复状态
        lixaoyao.recoveryState(stateAdmin.getMemento());
        lixaoyao.stateDisplay();


    }
}
