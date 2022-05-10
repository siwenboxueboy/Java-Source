package com.lamuda.demo.designpattern.visitor;

import cn.hutool.core.util.StrUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @description: 用于将带有指定后缀名的文件汇集起来
 * @author: 王斯博
 * @date: 2021-08-20 10:34
 **/
public class FileFindVisitor extends Visitor{

    private String suffix;
    private List<File> list = new ArrayList<>();

    public Iterator getFoundFiles(){
        return list.iterator();
    }

    public FileFindVisitor(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(suffix)){
            list.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            //这里的this代表的是访问者具体实例，只有接受了具体访问者实例，才可以访问
            entry.accept(this);
        }
    }


}
