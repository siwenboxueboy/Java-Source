package com.lamuda.demo.designpattern.observer;

/**
 * 以数字形式显示数值的类
 * 具体的观察者
 * @author 王斯博
 * 2022-03-04 08:38
 */
public class DigitObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
