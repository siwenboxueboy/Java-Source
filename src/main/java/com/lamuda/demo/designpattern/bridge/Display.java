package com.lamuda.demo.designpattern.bridge;

/**
 * @description:负责显示的类 类的功能层次结构
 * @author: 王斯博
 * @date: 2021-08-16 08:31
 **/
public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open(){
        impl.rawOpen();
    }

    public void print(){
        impl.rawPrint();
    }

    public void close(){
        impl.rawClose();
    }

    //相当于默认功能
    public final void display(){
        open();
        print();
        close();
    }

}
