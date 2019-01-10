package com.adapterpattern;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月10日
 * @描述: 适配者类-mp4多媒体接口播放实现
 **/

public class Mp4PlayerAdaptee implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放mp4文件:" + fileName);
    }
}
