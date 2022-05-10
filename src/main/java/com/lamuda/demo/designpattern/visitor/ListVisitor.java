package com.lamuda.demo.designpattern.visitor;

import java.util.Iterator;

/**
 * @description: Visitor类的子类，显示文件和文件夹一览
 * @author: 王斯博
 * @date: 2021-08-20 09:14
 **/
public class ListVisitor extends Visitor{

    private String currentdir = "";

    /*
    * 待访问对象被传递过来，则可以进行访问
    * */

    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            //这里的this代表的是访问者具体实例，只有接受了具体访问者实例，才可以访问
            entry.accept(this);
        }
        currentdir = savedir;
    }
}
