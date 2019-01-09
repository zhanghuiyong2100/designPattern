package com.statepattern;

import com.statepattern.concrete.state.StateWorkState;
import com.statepattern.context.WorkContext;
import org.junit.Test;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月09日
 * @描述: 测试Demo
 **/

public class StatePatternDemo {

    @Test
    public void testDemoA() {
        WorkContext workContext = new WorkContext();
        StateWorkState stateWorkState = new StateWorkState();
        stateWorkState.doAction(workContext);
        System.out.println(workContext.getWorkState().toString());
    }


}
