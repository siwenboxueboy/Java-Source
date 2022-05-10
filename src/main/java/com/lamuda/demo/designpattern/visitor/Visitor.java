package com.lamuda.demo.designpattern.visitor;

/**
 * @description: 表示访问者的抽象类
 * @author: 王斯博
 * @date: 2021-08-20 09:13
 **/
public abstract class Visitor {
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
