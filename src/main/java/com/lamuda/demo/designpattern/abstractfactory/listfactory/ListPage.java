package com.lamuda.demo.designpattern.abstractfactory.listfactory;

import com.lamuda.demo.designpattern.abstractfactory.factory.Item;
import com.lamuda.demo.designpattern.abstractfactory.factory.Page;

import java.util.Iterator;

/**
 * @description: 具体零件，表示HTML页面的类
 * @author: 王斯博
 * @date: 2021-08-13 14:43
 **/
public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<ul>\n");
        Iterator iterator = content.iterator();
        while (iterator.hasNext()) {
            Item next = (Item) iterator.next();
            buffer.append(next.makeHTML()); // 调用组件的makeHtml
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + author + "</adress>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
