package com.adapterpattern;


/**
 * @author zhanghuiyong
 * @创建时间 2019年01月10日
 * @描述: 适配者类-媒体播放实体类
 **/

public class AudioPlayer implements MeidaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String type, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if ("mp3".equals(type)) {
            System.out.println("播放MP3文件:" + fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if ("mp4".equals(type) || "vlc".equals(type)) {
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type, fileName);
        } else {
            System.out.println("不能播放这个文件类型");
        }


    }
}
