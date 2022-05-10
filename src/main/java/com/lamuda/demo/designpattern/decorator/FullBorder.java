package com.lamuda.demo.designpattern.decorator;

/**
 * @description: 用于显示上下左右边框的类
 * @author: 王斯博
 * @date: 2021-08-18 11:09
 **/
public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getCloums() {
        return 1 + display.getCloums() + 1;
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        //第一行或者最后一行
        if (row == 0 || row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getCloums()) + "+";
        } else {
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    //制作首行 尾行
    private String makeLine(char ch, int count) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
