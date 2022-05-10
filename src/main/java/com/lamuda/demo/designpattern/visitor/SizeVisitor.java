package com.lamuda.demo.designpattern.visitor;

import java.util.Iterator;

/**
 * @description: 获取文件夹大小
 * @author: 王斯博
 * @date: 2021-08-20 10:58
 **/
public class SizeVisitor  extends Visitor{
    private String currentdir = "";
    public Integer lSize = 0;

    @Override
    public void visit(File file) {
        lSize += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        int size = 0;
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
        size = this.lSize;
        this.lSize = 0;
        System.out.println(directory.getName() + " : " + size);
    }
}
