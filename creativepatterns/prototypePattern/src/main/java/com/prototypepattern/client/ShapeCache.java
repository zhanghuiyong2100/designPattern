package com.prototypepattern.client;

import com.prototypepattern.concreteprototype.Circle;
import com.prototypepattern.concreteprototype.Rectangle;
import com.prototypepattern.concreteprototype.Square;
import com.prototypepattern.prototype.Shape;

import java.util.Hashtable;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月05日
 * @描述: 创建型模型-原型模式-客户类-图形缓存
 **/

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape) cacheShape.clone();
    }


    /**
     * 对每种形状都运行数据库查询，并创建该形状
     * shapeMap.put(shapeKey, shape);
     * 例如，我们要添加三种形状
     */
    public static void locakCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
