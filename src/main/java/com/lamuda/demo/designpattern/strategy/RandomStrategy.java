package com.lamuda.demo.designpattern.strategy;

import java.util.Random;

/**
 * @description: 随机手势
 * @author: 王斯博
 * @date: 2021-08-16 11:04
 **/
public class RandomStrategy implements Strategy{

    private Random random;

    public RandomStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        return Hand.getHand(random.nextInt());
    }

    @Override
    public void study(boolean win) {
        //无需学习
    }
}
