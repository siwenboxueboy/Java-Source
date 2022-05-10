package com.lamuda.demo.designpattern.templateMethod;

/**
 * @description: 具体类
 * @author: 王斯博
 * @date: 2021-08-02 15:13
 **/
public class CharDisplay extends AbstractDispaly{
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.printf("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
