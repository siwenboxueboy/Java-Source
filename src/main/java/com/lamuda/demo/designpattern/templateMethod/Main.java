package com.lamuda.demo.designpattern.templateMethod;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-02 15:19
 **/
public class Main {
    public static void main(String[] args) {
        //create a CharDisplay class instance that has a 'H'
        AbstractDispaly d1 = new CharDisplay('H');
        //create a StringDisplay class instance that has a string of "hello world"
        AbstractDispaly d2 = new StringDisplay("hello,world");
        //create a StringDisplay class instance that has a string of "hello world"
        AbstractDispaly d3 = new StringDisplay("你好，世界");
        d1.dispaly();
        d2.dispaly();
        d3.dispaly();
    }
}
