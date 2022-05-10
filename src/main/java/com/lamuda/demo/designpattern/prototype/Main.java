package com.lamuda.demo.designpattern.prototype;

import com.lamuda.demo.designpattern.prototype.concrete.MessageBox;
import com.lamuda.demo.designpattern.prototype.concrete.UnderLinePen;
import com.lamuda.demo.designpattern.prototype.framework.Manager;
import com.lamuda.demo.designpattern.prototype.framework.Product;

/**
 * @description: 用于创建重复的对象
 * @author: 王斯博
 * @date: 2021-08-12 10:47
 **/
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderLinePen upen = new UnderLinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        //注册，以后生成的时候直接复制这些类即可
        manager.register("strong message",upen);
        manager.register("warning box",mbox);
        manager.register("slash box",sbox);

        //使用的时候直接复制一个上述已经注册的对象即可
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }

}
