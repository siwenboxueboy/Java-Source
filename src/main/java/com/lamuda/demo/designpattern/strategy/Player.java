package com.lamuda.demo.designpattern.strategy;

import cn.hutool.captcha.generator.AbstractGenerator;

/**
 * @description: 表示进行猜拳游戏选手的类
 * @author: 王斯博
 * @date: 2021-08-16 10:03
 **/
public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecont;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand(){
        return strategy.nextHand();
    }

    public void win(){
        strategy.study(true);
        wincount++;
        gamecont++;
    }

    public void lose(){
        strategy.study(false);
        losecount++;
        gamecont++;
    }

    public void even(){
        gamecont++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", wincount=" + wincount +
                ", losecount=" + losecount +
                ", gamecont=" + gamecont +
                '}';
    }
}
