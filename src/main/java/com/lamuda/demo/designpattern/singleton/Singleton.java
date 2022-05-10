package com.lamuda.demo.designpattern.singleton;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-12 09:27
 **/
public class Singleton {
    private static Singleton singleton = new Singleton();

//    构造方法修饰符为private
    private Singleton() {
        System.out.println("生成了一个实例。");
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
