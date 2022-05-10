package com.lamuda.demo.designpattern.templateMethod;

import java.io.InputStream;

/**
 * @description:抽象类，实现模板方法，和用到的抽象方法
 * @author: 王斯博
 * @date: 2021-08-02 15:12
 **/
public abstract class AbstractDispaly {

    //抽象方法

    public abstract void open();

    public abstract void print();

    public abstract void close();

    //模板方法
    public final void dispaly() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
