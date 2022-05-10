package com.lamuda.demo.designpattern.proxy;

/**
 * @author 王斯博
 * 2022-03-04 14:13
 */
public class Main {
    public static void main(String[] args) {

        Printable p = new PrinterProxy("Alice");
        System.out.println("现在的名字是" + p.getPrinterName());
        p.setPrinterName("Bob");
        System.out.println("现在的名字是" + p.getPrinterName());
        p.print("Hello world");

    }
}
