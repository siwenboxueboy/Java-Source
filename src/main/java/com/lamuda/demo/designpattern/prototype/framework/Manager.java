package com.lamuda.demo.designpattern.prototype.framework;

import java.util.HashMap;

/**
 * @description:使用Product接口来复制实例,根据实例原型来生成具体的实例
 * @author: 王斯博
 * @date: 2021-08-12 10:07
 **/
public class Manager {
//    K：名字 V：实例
    private HashMap<String,Product> shwocase = new HashMap();
//   入参为一组 名字，Product接口
    public void register(String name,Product proto){
        shwocase.put(name,proto);
    }

    public Product create(String protoname){
        Product p = shwocase.get(protoname);
        return p.createClone();
    }
}