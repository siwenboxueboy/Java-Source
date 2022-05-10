package com.lamuda.demo.designpattern.iterator;
/*
* 迭代器接口
* 用于遍历集合中的元素
* */
public interface Iterator {

    /**
     * create by: 王斯博
     * description: 确认接下来是否可以调用next方法
     * * @Param: null
     *
     * @return
     */
    boolean hasNext();

    /**
     * create by: 王斯博
     * description: 返回当前的元素，并指向下一个元素
     * * @Param: null
     *
     * @return
     */
    Object next();
}
