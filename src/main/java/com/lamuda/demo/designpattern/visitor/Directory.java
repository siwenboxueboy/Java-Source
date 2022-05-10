package com.lamuda.demo.designpattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @description: 文件夹
 * @author: 王斯博
 * @date: 2021-08-16 15:19
 **/
public class Directory extends Entry {
    private String name;
    private ArrayList directory = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry){
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.printList(prefix + "/" + name);
        }
    }

    public Iterator iterator(){
        return directory.iterator();
    }

    @Override
    public void accept(Visitor v) {
        //接受访问者的访问 将自己传递给访问者 之后访问者会根据类型执行访问者内部的方法
        v.visit(this);
    }

    /*
    * 回调
    * 以前是你学习 老师看着你学习 学习完了老师就去改你的作业 （老师相当于轮询线程，已知去询问工作线程工作完成了没有）
    * 现在是你学习 学习完了叫老师过来（老师不用盯着你看你啥时候学完了，老师只需要接收学生通知就好了）
    * 回调是将老师与学生的通信发起端调整到了学生端，即工作线程端
    * */
}
