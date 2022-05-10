package com.lamuda.demo.designpattern.abstractfactory;

import com.lamuda.demo.designpattern.abstractfactory.factory.Factory;
import com.lamuda.demo.designpattern.abstractfactory.factory.Link;
import com.lamuda.demo.designpattern.abstractfactory.factory.Page;
import com.lamuda.demo.designpattern.abstractfactory.factory.Tray;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-13 14:41
 **/
public class Main {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Usage: java Main class.name.of.ConcreFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);
        Link people = factory.createLink("人民日报", "http://www.people.com.cn");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link excite = factory.createLink("", "");
        Link google = factory.createLink("", "");

        Tray traynews = factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        Tray traysearch = factory.createTray("检索引擎");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "杨文轩");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
