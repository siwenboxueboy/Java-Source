package com.lamuda.demo.designpattern.adapter;

/*
* 所需的程序，12V，作用：Target，定义所需的方法
* */
public interface Print {
    /**
     * create by: 王斯博
     * description: ()
     * @Param: null
     *
     * @return
     */
     void printWeak();

    /**
     * create by: 王斯博
     * description: **
     * * @Param: null
     *
     * @return
     */
     void printStrong();
}
