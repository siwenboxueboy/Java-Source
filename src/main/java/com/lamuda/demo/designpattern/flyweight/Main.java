package com.lamuda.demo.designpattern.flyweight;

/**
 * @author 王斯博
 * 2022-03-04 13:48
 */
public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.exit(0);
        }
        BigString bs = new BigString(args[0]);
        bs.print();
    }
}
