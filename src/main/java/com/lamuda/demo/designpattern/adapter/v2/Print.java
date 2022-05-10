package com.lamuda.demo.designpattern.adapter.v2;

/**
 * @description:所需的程序，12V,作用：Target，定义所需的方法
 * @author: 王斯博
 * @date: 2021-07-31 17:51
 **/
public abstract class Print {
    /**
     * create by: 王斯博
     * description: ()
     * * @Param: null
     *
     * @return
     */
    abstract void printWeak();

    /**
     * create by: 王斯博
     * description: **
     * * @Param: null
     *
     * @return
     */
    abstract void printStrong();
}
