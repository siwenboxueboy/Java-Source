package com.lamuda.demo.designpattern.bridge.test;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-16 09:32
 **/
public class UnixOS extends OSImpl{
    @Override
    public void ready() {
        System.out.println("Unix os ready application");
    }

    @Override
    public void run() {
        System.out.println("Unix os run application");
    }

    @Override
    public void collect() {
        System.out.println("Unix os collect garbage application");
    }
}
