package com.lamuda.demo.designpattern.composite;

import java.util.zip.Adler32;

/**
 * @description: 抽象实体类 用来实现File和Directory
 * @author: 王斯博
 * @date: 2021-08-16 15:16
 **/
public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatementException{
//        这样使得File类中新增时报错，保证了只能在Directory中新增文件
        throw new FileTreatementException();
    }

    public void printList(){
        printList("");
    }

    protected abstract void printList(String prefix);

    // 模板模式 getName and getSize 由子类去实现
    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }

    /*
    * 部门与人员 门组与门禁 都可以利用组合模式
    *
    * */
}
