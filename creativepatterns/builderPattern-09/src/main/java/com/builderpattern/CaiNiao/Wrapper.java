package com.builderpattern.CaiNiao;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月07日
 * @描述: 包装接口-纸质包装类
 **/

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "纸质包装";
    }
}
