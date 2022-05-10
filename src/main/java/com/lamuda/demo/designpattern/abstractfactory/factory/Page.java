package com.lamuda.demo.designpattern.abstractfactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * @description: 抽象的产品，表示HTML页面的类
 * @author: 王斯博
 * @date: 2021-08-13 14:41
 **/
public abstract class Page {

    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item){
        content.add(item);
    }

    public void output(){
        try {
            String filename = title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(makeHTML());
            writer.close();
            System.out.println(filename + "编写完成。");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
