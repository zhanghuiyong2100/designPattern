package com.adapterpattern;

import org.junit.Test;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月10日
 * @描述: 测试
 **/

public class AdapterPatternDemo {

    @Test
    public void testDemoA() {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "青蛇.mp3");
        audioPlayer.play("mp4", "青蛇MV.mp4");
        audioPlayer.play("vlc", "青蛇.vlc");
        audioPlayer.play("mng", "青蛇.mng");
    }
}
