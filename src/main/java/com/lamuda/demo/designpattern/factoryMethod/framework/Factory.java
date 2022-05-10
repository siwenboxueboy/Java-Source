package com.lamuda.demo.designpattern.factoryMethod.framework;

/**
 * framework包：生成实例的框架
 * @description:
 * @author: 王斯博
 * @date: 2021-08-12 08:08
 **/
public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
//    生成实例
    protected abstract Product createProduct(String owner);
//    注册产品
    protected abstract void registerProduct(Product product);
}