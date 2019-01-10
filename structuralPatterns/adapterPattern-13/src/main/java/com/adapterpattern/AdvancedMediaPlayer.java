package com.adapterpattern;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月10日
 * @描述: 目标抽象接口-多媒体播放接口
 **/
public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);

    void playMp4(String fileName);
}
