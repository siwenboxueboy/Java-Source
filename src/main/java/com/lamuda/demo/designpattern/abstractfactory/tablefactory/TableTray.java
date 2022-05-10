package com.lamuda.demo.designpattern.abstractfactory.tablefactory;

import com.lamuda.demo.designpattern.abstractfactory.factory.Item;
import com.lamuda.demo.designpattern.abstractfactory.factory.Tray;

import java.util.Iterator;

/**
 * @author 王斯博
 * 2022-02-23 14:25
 */
public class TableTray extends Tray {
    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<td>");
        buffer.append("<table width=\"100%\" border=\"1\"><tr>");
        buffer.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"" + tray.size()
        + "\"><b>" + caption + "</b></td>");
        buffer.append("</tr>\n");
        buffer.append("<tr>\n");
        Iterator iterator = tray.iterator();
        while (iterator.hasNext()) {
            Item next = (Item) iterator.next();
            buffer.append(next.makeHTML());
        }
        buffer.append("</tr></table>");
        buffer.append("</td>");
        return buffer.toString();
    }

    public TableTray(String caption) {
        super(caption);
    }
}
