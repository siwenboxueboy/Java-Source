package com.lamuda.demo.designpattern.abstractfactory.listfactory;

import com.lamuda.demo.designpattern.abstractfactory.factory.Item;
import com.lamuda.demo.designpattern.abstractfactory.factory.Tray;
import com.lamuda.demo.designpattern.iterator.Iterator;

/**
 * @description: 具体零件，表示含有Link和Tray的类
 * @author: 王斯博
 * @date: 2021-08-13 14:43
 **/
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Iterator it = (Iterator) tray.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</li>\n");
        buffer.append("</ul>\n");
        return buffer.toString();
    }
}
