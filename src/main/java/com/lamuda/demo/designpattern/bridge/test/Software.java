package com.lamuda.demo.designpattern.bridge.test;

/**
 * @description: 软件
 * @author: 王斯博
 * @date: 2021-08-16 09:23
 **/
public class Software {
    private OSImpl os;

    public Software(OSImpl os) {
        this.os = os;
    }

    public void ready(){
        os.ready();
    }

    public void run(){
        os.run();
    }

    public void collect(){
        os.collect();
    }


}
