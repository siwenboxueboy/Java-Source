package com.lamuda.demo.designpattern.prototype.framework;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-12 11:17
 **/
public abstract class CloneObj implements Product{

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
