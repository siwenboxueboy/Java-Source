package com.lamuda.demo.designpattern.composite.test;

import com.lamuda.demo.designpattern.composite.FileTreatementException;

/**
 * @description:一套行为 分别在不同的子类里面去实现
 * @author: 王斯博
 * @date: 2021-08-18 09:30
 **/
public abstract class Obj {
    protected Obj parent;//父节点 构建全路径时使用
    public static Integer departmentIncreaseSeed = 0;
    public static Integer personIncreaseSeed = 0;
    public abstract String getName();

    public abstract Integer getId();

    public Obj add(Obj entry) throws FileTreatementException {
//        这样使得Person类中新增时报错，保证了只能在Department中新增人员
        throw new FileTreatementException();
    }

    //向外部提供的展示的接口
    public void printList(){
        printList("");
    }

    //内部实现的接口
    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName();
    }

    public String getFullName() {
        StringBuffer fullname = new StringBuffer();
        Obj obj = this;
        //find obj parent until parent is null
        do {
            fullname.insert(0, "/" + obj.getName());
            obj = obj.parent;
        } while (obj != null);
        return fullname.toString();
    }
}
