package com.lamuda.demo.designpattern.memento;

import com.lamuda.demo.designpattern.memento.game.Gamer;
import com.lamuda.demo.designpattern.memento.game.Memento;

/**
 * @author 王斯博
 * 2022-03-04 09:36
 */
public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("======" + i);
            System.out.println("current state is : " + gamer);
            gamer.bet();// game
            System.out.println("所持金钱为 " + gamer.getMoney() + "元");
            // 决定如何处理Memento
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("金钱增加,保存游戏状态");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("金钱减少,游戏恢复之前的状态");
                gamer.restoreMemento(memento);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
