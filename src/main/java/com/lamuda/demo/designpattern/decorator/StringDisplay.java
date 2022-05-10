package com.lamuda.demo.designpattern.decorator;

import java.nio.charset.StandardCharsets;

/**
 * @description: 用于显示单行字符串的类
 * @author: 王斯博
 * @date: 2021-08-18 11:07
 **/
public class StringDisplay extends Display {

    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    //横向字符数
    @Override
    public int getCloums() {
        return string.getBytes(StandardCharsets.UTF_8).length;
    }

    //纵向行数 默认1行
    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        //第0行的时候返回
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }


}
