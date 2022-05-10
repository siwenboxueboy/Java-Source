package com.lamuda.demo.designpattern.decorator;

/**
 * @description: 用于只显示左右边框的类 是一种具体的装饰边框
 * @author: 王斯博
 * @date: 2021-08-18 11:08
 **/
public class SideBorder extends Border{

    private char borderChar;

    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getCloums() {
        //字符数为字符串字符数加上
        return 1 + display.getCloums() + 1;//两侧边框字符数
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        //给display加上装饰物
        return borderChar + display.getRowText(row) + borderChar;
    }
}
