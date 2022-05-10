package com.lamuda.demo.designpattern.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 表示生成数值的对象的抽象类
 * 观察对象
 * @author 王斯博
 * 2022-03-04 08:37
 */
public abstract class NumberGenerator {

    // 保存Observers
    private ArrayList observers = new ArrayList();

    // 注册Observer
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    // 向Observer发送通知
    public void notifyObservers() {
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer o = (Observer) it.next();
            o.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();

}
