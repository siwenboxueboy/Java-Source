package com.lamuda.demo.designpattern.decorator;

/**
 * @description: 不断地为对象添加装饰的设计模式被称为decorator模式
 * @author: 王斯博
 * @date: 2021-08-18 11:06
 **/
public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("wang sibo");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);

        b1.show();
        b2.show();
        b3.show();

        Display b4 = new SideBorder(
                new FullBorder(
                        new FullBorder(
                                new SideBorder(
                                        new FullBorder(
                                                new StringDisplay("你好，来吧。")
                                        ), '*'
                                )
                        )
                ), '/'
        );
        b4.show();
    }
}
