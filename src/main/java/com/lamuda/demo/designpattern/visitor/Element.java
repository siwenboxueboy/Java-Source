package com.lamuda.demo.designpattern.visitor;

/**
 * @description: 表示数据结构的接口，接受访问者的访问
 * @author: 王斯博
 * @date: 2021-08-20 09:14
 **/
public interface Element {
    //实现接受访问操作
    public abstract void accept(Visitor v);
}
