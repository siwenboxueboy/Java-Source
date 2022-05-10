package com.lamuda.demo.designpattern.bridge;

/**
 * @description: 桥接模式：功能与实现分离
 * @author: 王斯博
 * @date: 2021-08-16 08:34
 **/
public class Main {
    public static void main(String[] args) {

        // 可以将功能 与 实现分离开来 进行组合
        Display d1 = new Display(new StringDisplayImpl("Hello, China"));
        Display d2 = new CountDisplay(new StringDisplayImpl("hello,world"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("hello,universe"));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);

        Display display = new Display(new IncreaseDisplayImpl('<', '*', '>', 5));
        display.display();
        Display display1 = new Display(new IncreaseDisplayImpl('|', '#', '-', 5));
        display1.display();
    }
}
