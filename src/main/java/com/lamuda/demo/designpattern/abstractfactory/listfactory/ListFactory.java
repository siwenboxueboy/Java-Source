package com.lamuda.demo.designpattern.abstractfactory.listfactory;

import com.lamuda.demo.designpattern.abstractfactory.factory.Factory;
import com.lamuda.demo.designpattern.abstractfactory.factory.Link;
import com.lamuda.demo.designpattern.abstractfactory.factory.Page;
import com.lamuda.demo.designpattern.abstractfactory.factory.Tray;

/**
 * @description: 表示具体工厂的类（制作ListLink,ListTray,ListPage)
 * @author: 王斯博
 * @date: 2021-08-13 14:42
 **/
public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }

}
