package com.lamuda.demo.designpattern.bridge.test;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-16 09:31
 **/
public class LinuxOS extends OSImpl{
    @Override
    public void ready() {
        System.out.println("Linux os ready application");
    }

    @Override
    public void run() {
        System.out.println("Linux os run application");
    }

    @Override
    public void collect() {
        System.out.println("Linux os collect garbage application");
    }
}
