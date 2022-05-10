package com.lamuda.demo.designpattern.bridge.test;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-16 09:33
 **/
public class WeChat extends Software{
    public WeChat(OSImpl os) {
        super(os);
    }

    public void chatWithFriends(){
        ready();
        run();
        System.out.println("chat with friends");
    }

    public void exitChat(){
        collect();
        System.out.println("chat is over");
    }
}
