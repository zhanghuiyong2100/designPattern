package com.decoratorpattern.decorator;

import com.decoratorpattern.component.Component;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月03日
 * @描述: 结构性型模式-装饰器模式-抽象装饰类-服饰类
 **/

public abstract class BaseFinery implements Component {
    protected Component component;

    public BaseFinery(Component component) {
        this.component = component;
    }


    @Override
    public void show() {
        component.show();
    }
}
