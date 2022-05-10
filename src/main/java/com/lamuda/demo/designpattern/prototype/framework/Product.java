package com.lamuda.demo.designpattern.prototype.framework;
/*
* 复制功能的接口
* 角色：原型，该角色负责用于复制现有实例来生成新实例的方法
* */
public interface Product extends Cloneable{
    /*
    * 使用
    * */
    public abstract void use(String s);
    /*
    * 用于实例复制
    * */
    public abstract Product createClone();

}
