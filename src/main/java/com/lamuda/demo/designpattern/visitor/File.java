package com.lamuda.demo.designpattern.visitor;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-16 15:18
 **/
public class File extends Entry {
    private String name;
    private int size;
    public File(String name,int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }

    @Override
    public void accept(Visitor v) {
        //接受访问者的访问
        v.visit(this);
    }
}


