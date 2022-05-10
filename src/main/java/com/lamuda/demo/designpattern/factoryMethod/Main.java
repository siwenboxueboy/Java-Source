package com.lamuda.demo.designpattern.factoryMethod;

import com.lamuda.demo.designpattern.factoryMethod.framework.Factory;
import com.lamuda.demo.designpattern.factoryMethod.framework.Product;
import com.lamuda.demo.designpattern.factoryMethod.idcard.IDCard;
import com.lamuda.demo.designpattern.factoryMethod.idcard.IDCardFactory;

/**
 * @description:要实现制作身份证
 * @author: 王斯博
 * @date: 2021-08-12 08:10
 **/
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");

        card1.use();
        card2.use();
        card3.use();
    }
}
