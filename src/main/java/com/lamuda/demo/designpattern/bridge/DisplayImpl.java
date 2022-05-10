package com.lamuda.demo.designpattern.bridge;

/**
 * @description: 负责 显示 的类 类的实现层次结构
 * @author: 王斯博
 * @date: 2021-08-16 08:32
 **/
public abstract class DisplayImpl {
    public abstract void rawOpen();
    public abstract void rawPrint();
    public abstract void rawClose();
}
