package com.lamuda.demo.designpattern.abstractfactory.tablefactory;

import com.lamuda.demo.designpattern.abstractfactory.factory.Factory;
import com.lamuda.demo.designpattern.abstractfactory.factory.Link;
import com.lamuda.demo.designpattern.abstractfactory.factory.Page;
import com.lamuda.demo.designpattern.abstractfactory.factory.Tray;

/**
 * @author 王斯博
 * 2022-02-23 14:23
 */
public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title,author);
    }
}
