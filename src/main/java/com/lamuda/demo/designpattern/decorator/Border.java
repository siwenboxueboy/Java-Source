package com.lamuda.demo.designpattern.decorator;

/**
 * @description: 用于显示装饰边框的抽象类
 * @author: 王斯博
 * @date: 2021-08-18 11:08
 **/
public abstract class Border extends Display{

    //表示被装饰物
    protected Display display;

    //生成实例的时候通过参数指定被装饰物
    protected Border(Display display) {
        this.display = display;
    }

}
