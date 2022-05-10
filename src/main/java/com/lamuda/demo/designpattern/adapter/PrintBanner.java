package com.lamuda.demo.designpattern.adapter;

/**
 * @description: 适配器, 要使用Banner去实现Print的功能
 * v1:类适配器
 * 作用：将100V转换为12V
 * @author: 王斯博
 * @date: 2021-07-31 17:26
 **/
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
