package com.lamuda.demo.designpattern.decorator;

/**
 * @description: 用于显示字符串的抽象类 装饰前的component
 * @author: 王斯博
 * @date: 2021-08-18 11:07
 **/
public abstract class Display {

    //横向字符数量
    public abstract int getCloums();
    //纵向行数
    public abstract int getRows();
    //获取第row行的字符串
    public abstract String getRowText(int row);

    //全部显示 模板模式
    public final void show(){
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
