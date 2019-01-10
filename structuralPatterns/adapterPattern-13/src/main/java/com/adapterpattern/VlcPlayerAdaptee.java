package com.adapterpattern;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月10日
 * @描述: 适配者类-Vlc多媒体接口播放实现
 **/

public class VlcPlayerAdaptee implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放vlc文件:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
