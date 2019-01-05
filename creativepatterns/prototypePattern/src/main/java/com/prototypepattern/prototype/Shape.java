package com.prototypepattern.prototype;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月05日
 * @描述: 创建型模型-原型模式-抽象原型类-形状抽象类
 **/

public abstract class Shape implements Cloneable {
    private String id;

    protected String type;

     public abstract void draw();

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
