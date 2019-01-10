package com.adapterpattern;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月10日
 * @描述: MediaPlayers适配器类
 **/

public class MediaAdapter implements MeidaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if ("vlc".equals(audioType)) {
            advancedMediaPlayer = new VlcPlayerAdaptee();
        }
        if ("mp4".equals(audioType)) {
            advancedMediaPlayer = new Mp4PlayerAdaptee();
        }
    }

    @Override
    public void play(String type, String fileName) {
        if ("vlc".equals(type)) {
            advancedMediaPlayer.playVlc(fileName);
        }
        if ("mp4".equals(type)) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
