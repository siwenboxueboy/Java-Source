package com.lamuda.demo.designpattern.bridge.test;

/**
 * @description: qq音乐软件
 * @author: 王斯博
 * @date: 2021-08-16 09:27
 **/
public class QQmusic extends Software{

    public QQmusic(OSImpl os) {
        super(os);
    }

    public void listen(){
        ready();
        run();
        System.out.println("listen to music");
    }

    public void stop(){
        collect();
        System.out.println("music stopped");
    }
}
