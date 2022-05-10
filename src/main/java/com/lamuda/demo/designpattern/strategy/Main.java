package com.lamuda.demo.designpattern.strategy;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-16 10:03
 **/
public class Main {
    public static void main(String[] args) {
        int seed1 = 314;
        int seed2 = 15;
        Player player1 = new Player("Taro", new WinningStrategy(seed1));
        Player player2 = new Player("Hana", new ProbStrategy(seed2));
        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)){
                System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();
            }else if (nextHand2.isStrongerThan(nextHand1)){
                System.out.println("Winner:" + player2);
                player1.lose();
                player2.win();
            }else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }

        System.out.println("Total result");
        System.out.println(player1);
        System.out.println(player2);
    }
}
