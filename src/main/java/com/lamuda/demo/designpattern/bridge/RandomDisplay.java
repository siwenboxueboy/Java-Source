package com.lamuda.demo.designpattern.bridge;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-16 09:40
 **/
public class RandomDisplay extends Display{

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(){
        //编写这个随机方法即可

    }
}
