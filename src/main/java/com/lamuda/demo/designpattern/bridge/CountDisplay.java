package com.lamuda.demo.designpattern.bridge;

/**
 * @description: add 显示规定次数 这一功能的类 增加了新功能 类的功能层次结构
 * @author: 王斯博
 * @date: 2021-08-16 08:32
 **/
public class CountDisplay extends Display{
    /*
    *
    * 继承display,display中无需关心open,print,close这些实现，他们已经被分离出去，可以
    * 通过继承、实现DisplayImpl从而进行实现，实现方式也不知一种；
    * 而Display只需要关心这些基础功能可以构建出什么新功能，而无需去关心其实现
    * */
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times){
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
