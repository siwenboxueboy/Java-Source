package com.lamuda.demo.designpattern.observer;

/**
 * 表示以简单的图形形式显示数值的类
 * 具体的观察者
 * @author 王斯博
 * 2022-03-04 08:38
 */
public class GraphObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver:");
        int count = generator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
