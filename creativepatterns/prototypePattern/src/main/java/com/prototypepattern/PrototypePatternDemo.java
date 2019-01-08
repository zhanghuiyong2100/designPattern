package com.prototypepattern;

import com.prototypepattern.client.ShapeCache;
import com.prototypepattern.concreteprototype.Resume;
import com.prototypepattern.prototype.Shape;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月05日
 * @描述: 测试demo
 **/

public class PrototypePatternDemo {
    public static void main(String[] args) {
        /** 菜鸟教程  */
        ShapeCache.locakCache();

        Shape shape = ShapeCache.getShape("1");
        System.out.println("图形：" + shape.getType());
        shape.draw();
        Shape shape2 = ShapeCache.getShape("2");
        System.out.println("图形：" + shape2.getType());
        shape2.draw();
        Shape shape3 = ShapeCache.getShape("3");
        System.out.println("图形：" + shape3.getType());
        shape3.draw();

        /** ======================华丽分割线============================  */
        Resume resume = new Resume();
        resume.setPersonalInfo("大鸟", "男", "28");
        resume.setWorkExperience("2001-2002", "北京");

        Resume clone1 = (Resume) resume.clone();
        clone1.setWorkExperience("2002-2003", "上海");

        Resume clone2 = (Resume) resume.clone();
        clone2.setWorkExperience("2003-2004", "深圳");

        resume.Display();
        clone1.Display();
        clone2.Display();

    }
}
