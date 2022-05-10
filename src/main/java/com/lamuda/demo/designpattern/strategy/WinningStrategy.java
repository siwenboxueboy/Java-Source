package com.lamuda.demo.designpattern.strategy;

import java.util.Random;

/**
 * @description: 如果这局获胜，那么下一局也出相同的策略的类
 * @author: 王斯博
 * @date: 2021-08-16 10:01
 **/
public class WinningStrategy implements Strategy{

    private Random random;
    private boolean won = false;//上一局的输赢结果
    private Hand preHand;//上一局出的手势

    public WinningStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        //上一局输，则随机输出
        if (!won){
            preHand = Hand.getHand(random.nextInt(3));
        }
        //否则返回上一局结果
        return preHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
