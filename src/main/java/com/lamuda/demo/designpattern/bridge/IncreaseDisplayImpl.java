package com.lamuda.demo.designpattern.bridge;

/**
 * @description: 递增的显示效果
 * @author: 王斯博
 * @date: 2021-08-16 09:47
 **/
public class IncreaseDisplayImpl extends DisplayImpl{

    private char firstChar;
    private char secChar;
    private char thirdChar;
    private int count;

    public IncreaseDisplayImpl(char firstChar, char secChar, char thirdChar, int count) {
        this.firstChar = firstChar;
        this.secChar = secChar;
        this.thirdChar = thirdChar;
        this.count = count;
    }

    @Override
    public void rawOpen() {

    }

    @Override
    public void rawPrint() {
        for (int i = 1; i <= count; i++) {
            System.out.print(firstChar);
            for (int j = 1; j <= i-1; j++) {
                System.out.print(secChar);
            }
            System.out.println(thirdChar);
        }
    }

    @Override
    public void rawClose() {

    }
}
