package com.lamuda.demo.designpattern.composite.test;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-18 09:36
 **/
public class Person extends Obj{

    private String name;
    private Integer id;

    public Person(String name) {
        this.name = name;
        this.id = ++personIncreaseSeed;
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
        //此时this为Obj的toString()
        System.out.println(prefix + "/" + this);
    }
}
