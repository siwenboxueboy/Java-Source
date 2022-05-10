package com.lamuda.demo.designpattern.observer;

import java.util.Random;

/**
 * 生成随机数的类
 * 具体的观察对象
 * @author 王斯博
 * 2022-03-04 08:38
 */
public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();
    // 当前数值
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
