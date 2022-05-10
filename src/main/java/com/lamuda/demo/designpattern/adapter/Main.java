package com.lamuda.demo.designpattern.adapter;

/**
 * @description:Clent
 * @author: 王斯博
 * @date: 2021-07-31 17:36
 **/
public class Main {
    /*
     * @description th
     * @return gfd
     *
     * @param null 
     */
    public static void main(String[] args) {
        // 所需的程序，12V
        /*
        * 习题1：那样会暴露原有被适配类的API，但是现在我只想用target的功能
        *
        * */
        Print hello = new PrintBanner("Hello");
        hello.printWeak();
        hello.printStrong();
    }
}
