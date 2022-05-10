package com.lamuda.demo.designpattern.strategy;

/**
 * @description: 表示猜拳游戏中的策略的类
 * @author: 王斯博
 * @date: 2021-08-16 10:00
 **/
public interface Strategy {
//
    public abstract Hand nextHand();
//
    public abstract void study(boolean win);
}
