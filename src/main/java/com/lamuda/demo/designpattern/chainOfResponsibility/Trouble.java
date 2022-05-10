package com.lamuda.demo.designpattern.chainOfResponsibility;

/**
 * 发生问题的类,带有问题编号
 *
 * @author 王斯博
 * 2022-03-03 08:27
 */
public class Trouble {

    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Trouble{" +
                "number=" + number +
                '}';
    }
}
