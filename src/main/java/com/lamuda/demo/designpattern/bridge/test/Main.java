package com.lamuda.demo.designpattern.bridge.test;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-16 09:35
 **/
public class Main {
    public static void main(String[] args) {
        QQmusic qQmusic = new QQmusic(new LinuxOS());
        WeChat weChat = new WeChat(new WindowsOS());
        qQmusic.listen();
        weChat.chatWithFriends();
        qQmusic.stop();
        weChat.exitChat();
    }
}
