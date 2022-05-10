package com.lamuda.demo.designpattern.abstractfactory.factory;

/**
 * @description: Link抽象零件，表示HTML超链接的类
 * @author: 王斯博
 * @date: 2021-08-13 14:40
 **/
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
