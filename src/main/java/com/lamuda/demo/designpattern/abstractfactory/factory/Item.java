package com.lamuda.demo.designpattern.abstractfactory.factory;

/**
 * @description: 方便统一处理Link和Tray
 * @author: 王斯博
 * @date: 2021-08-13 14:39
 **/
public abstract class Item {
    //表示项目的标题
    protected String caption;

    public Item(String caption){
        this.caption = caption;
    }

    /*
     * @description 返回HTML文件的内容
     * @return
     *
     * @param null
     */
    public abstract String makeHTML();

}
