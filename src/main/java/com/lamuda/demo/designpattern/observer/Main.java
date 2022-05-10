package com.lamuda.demo.designpattern.observer;

/**
 * @author 王斯博
 * 将观察者聚合到观察对象中,实现notify方法,调用观察者update()方法
 * notify方法可以被具体观察者在合适的地方调用
 * 2022-03-04 08:36
 */
public class Main {

    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }

}
