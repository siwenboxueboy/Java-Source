package com.lamuda.demo.designpattern.abstractfactory.listfactory;

import com.lamuda.demo.designpattern.abstractfactory.factory.Link;

/**
 * @description: 具体零件，表示HTML的链接的类
 * @author: 王斯博
 * @date: 2021-08-13 14:42
 **/
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return " <li><a href=\""+url+"\""+caption+"</a></li>\n";
    }
}
