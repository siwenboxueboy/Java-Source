package com.lamuda.demo.designpattern.builder;

/**
 * @description: 有编写文档的方法，负责使用Builder来生成实例，只调用在Builder的方法
 * @author: 王斯博
 * @date: 2021-08-12 13:49
 **/
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //只负责组装，不负责具体实现，具体实现依赖于builder的子类
    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("从早上至下午 ");
        builder.makeItems(new String[]{
                "morning。",
                "afternoon。"
        });
        builder.makeString("晚上");
        builder.makeItems(new String[]{
                "night",
                "evening",
                "bey"
        });
        builder.close();
    }
}
