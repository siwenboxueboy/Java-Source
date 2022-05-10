package com.lamuda.demo.designpattern.memento.game;

import java.util.ArrayList;
import java.util.List;

/**
 * 表示Gamer状态的类
 *
 * @author 王斯博
 * 2022-03-04 09:35
 */
public class Memento {

    int money;
    ArrayList fruits;

    // 获取当前所持金钱
    public int getMoney() {
        return money;
    }

    // wide interface 指所有用于获取恢复对象信息的方法的集合
    // narrow interface 为外部提供的内部信息非常有限,可有效防止泄露


    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public List getFruits() {
        return (List) fruits.clone();
    }
}
