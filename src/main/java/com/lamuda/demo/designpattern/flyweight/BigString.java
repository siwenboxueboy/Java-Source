package com.lamuda.demo.designpattern.flyweight;

/**
 * 表示多个BigChar组成的"大型字符串"的类
 *
 * @author 王斯博
 * 2022-03-04 13:47
 */
public class BigString {

    private BigChar[] bigChars;

    public BigString(String string) {
        bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public void print() {
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }
}
