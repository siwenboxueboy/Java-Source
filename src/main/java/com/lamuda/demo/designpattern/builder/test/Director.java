package com.lamuda.demo.designpattern.builder.test;


/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-12 15:12
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
