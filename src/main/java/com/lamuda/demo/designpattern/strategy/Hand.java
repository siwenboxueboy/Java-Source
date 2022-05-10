package com.lamuda.demo.designpattern.strategy;

/**
 * @description: 表示猜拳手势的类
 * @author: 王斯博
 * @date: 2021-08-16 10:00
 **/
public class Hand {
    /*
     * 0石头
     * 1剪刀
     * 2布
     *
     * */

    public static final int HANDVALUE_GUU = 0;
    public static final int HANDVALUE_CHO = 1;
    public static final int HANDVALUE_PAA = 2;
    public static final Hand[] hand = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA)
    };

    private static final String[] name = {
            "石头", "剪刀", "布"
    };

    private int handValue;

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    //
    private int fight(Hand h) {
        //为什么可以this == h ,因为Hand只有三个对象，0，1，2，所以只要其地址一样即可
        if (this == h) {
            return 0;
        } else if ((this.handValue + 1) % 3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return name[handValue];
    }
}
