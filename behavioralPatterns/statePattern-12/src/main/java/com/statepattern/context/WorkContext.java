package com.statepattern.context;

import com.statepattern.state.IWorkState;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月09日
 * @描述: 环境类-工作环境类
 **/

public class WorkContext {
    private IWorkState workState;

    public WorkContext() {
        workState = null;
    }

    public IWorkState getWorkState() {
        return workState;
    }

    public void setWorkState(IWorkState workState) {
        this.workState = workState;
    }
}
