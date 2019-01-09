package com.statepattern.state;

import com.statepattern.context.WorkContext;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月09日
 * @描述: 行为型模式-状态模式-抽象状态类-工作状态接口
 **/

public interface IWorkState {
    void doAction(WorkContext workContext);
}
