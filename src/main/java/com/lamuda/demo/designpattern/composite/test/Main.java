package com.lamuda.demo.designpattern.composite.test;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-18 09:55
 **/
public class Main {
    public static void main(String[] args) {

        Department department1 = new Department("部门1");
        Department department11 = new Department("部门1-1");
        Department department12 = new Department("部门1-2");
        Department department2 = new Department("部门2");

        Person person1 = new Person("人员1");
        Person person2 = new Person("人员2");
        Person person3 = new Person("人员3");
        Person person4 = new Person("人员4");
        Person person5 = new Person("人员5");
        Person person6 = new Person("人员6");

        department1.add(department11);
        department1.add(department12);
        department1.add(person1);
        department11.add(person2);
        department11.add(person3);
        department12.add(person4);
        department12.add(person5);
        department2.add(person6);

        department1.printList();
        department2.printList();

        System.out.println(person2.getFullName());
        System.out.println(department11.getFullName());
    }
}
