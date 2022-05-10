package com.lamuda.demo.designpattern.abstractfactory.factory;

import java.util.ArrayList;

/**
 * @description: 抽象零件，表示含有Link和Tray的类
 * @author: 王斯博
 * @date: 2021-08-13 14:40
 **/
public abstract class Tray extends Item{

    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item){
        this.tray.add(item);
    }
}
