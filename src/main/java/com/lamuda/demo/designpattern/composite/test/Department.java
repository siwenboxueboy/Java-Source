package com.lamuda.demo.designpattern.composite.test;

import com.lamuda.demo.designpattern.composite.FileTreatementException;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-18 09:36
 **/
public class Department extends Obj {


    private String name;
    private Integer id;
    private List<Obj> departments = new ArrayList<>();

    public Department(String name) {
        this.name = name;
        this.id = ++departmentIncreaseSeed;
    }

    /*
    * 生成一个唯一Id
    * */

    @Override
    public Obj add(Obj entry) throws FileTreatementException {
        //增加的有可能时部门 也有可能时人员
        departments.add(entry);
        //设置父节点为自己
        entry.parent = this;
        //返回值为自己 Obj
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    protected void printList(String prefix) {
        //print myself
        System.out.println(prefix + "/" + name);
        //print my children
        departments.forEach(e ->{
            e.printList(prefix + "/" + name);
        });
    }
}
