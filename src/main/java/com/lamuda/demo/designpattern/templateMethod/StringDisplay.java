package com.lamuda.demo.designpattern.templateMethod;

/**
 * @description: 具体类
 * @author: 王斯博
 * @date: 2021-08-02 15:16
 **/
public class StringDisplay extends AbstractDispaly {
    private String string;
    private int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.printf("-");
        }
        System.out.println("+");
    }
}
