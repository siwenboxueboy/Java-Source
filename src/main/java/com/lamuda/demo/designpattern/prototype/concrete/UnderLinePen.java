package com.lamuda.demo.designpattern.prototype.concrete;

import com.lamuda.demo.designpattern.prototype.framework.CloneObj;
import com.lamuda.demo.designpattern.prototype.framework.Product;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-12 10:25
 **/
public class UnderLinePen extends CloneObj {
    private char ulchar;

    public UnderLinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        for (int i = 0; i < length ; i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

}
