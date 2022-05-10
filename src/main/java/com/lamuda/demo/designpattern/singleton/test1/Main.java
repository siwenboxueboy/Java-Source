package com.lamuda.demo.designpattern.singleton.test1;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-12 09:46
 **/
public class Main {
    public static void main(String[] args) {
        Triple triple = Triple.getInstance(0);
        Triple triple1 = Triple.getInstance(1);
        Triple triple2 = Triple.getInstance(2);
        Triple triple3 = Triple.getInstance(0);
        if (triple == triple1) {
            System.out.println("0==1");
        }else {
            System.out.println("0!=1");
        }
        if (triple1 == triple2) {
            System.out.println("1==2");
        }else {
            System.out.println("1!=2");
        }
        if (triple == triple3) {
            System.out.println("0==3");
        }else {
            System.out.println("0!=3");
        }
    }
}
