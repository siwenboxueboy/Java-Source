package com.lamuda.demo.designpattern.builder;

/**
 * @description:实现了构建文本对象的基本动作
 * @author: 王斯博
 * @date: 2021-08-12 14:01
 **/
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("================\n");
        buffer.append("『" + title + "』\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append('■' + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("  ﹒" + items[i] + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
