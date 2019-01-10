package com.adapterpattern;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月10日
 * @描述: 结构型模式-适配器模式-目标抽象类-媒体播放器接口
 **/
public interface MeidaPlayer {
    public void play(String type, String fileName);
}
