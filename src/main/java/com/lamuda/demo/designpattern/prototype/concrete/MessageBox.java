package com.lamuda.demo.designpattern.prototype.concrete;

import com.lamuda.demo.designpattern.prototype.framework.CloneObj;
import com.lamuda.demo.designpattern.prototype.framework.Product;

/**
 * @description:具体的原型
 * @author: 王斯博
 * @date: 2021-08-12 10:20
 **/
public class MessageBox  extends CloneObj {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }

}
