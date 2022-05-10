package com.lamuda.demo.designpattern.abstractfactory.tablefactory;

import com.lamuda.demo.designpattern.abstractfactory.factory.Link;

/**
 * @author 王斯博
 * 2022-02-23 14:24
 */
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
