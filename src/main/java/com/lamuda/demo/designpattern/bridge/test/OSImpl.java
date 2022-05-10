package com.lamuda.demo.designpattern.bridge.test;

/**
 * @description: os的实现 最高层
 * @author: 王斯博
 * @date: 2021-08-16 09:24
 **/
public abstract class OSImpl {
    public abstract void ready();
    public abstract void run();
    public abstract void collect();
}
