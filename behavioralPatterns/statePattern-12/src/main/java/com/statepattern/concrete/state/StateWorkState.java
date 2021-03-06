package com.statepattern.concrete.state;

import com.statepattern.context.WorkContext;
import com.statepattern.state.IWorkState;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月09日
 * @描述: 具体状态类-开启状态类
 **/

public class StateWorkState implements IWorkState {
    @Override
    public void doAction(WorkContext workContext) {
        System.out.println("开始工作吧！");
        workContext.setWorkState(this);
    }

    @Override
    public String toString() {
        return "开始 工作状态";
    }
}
