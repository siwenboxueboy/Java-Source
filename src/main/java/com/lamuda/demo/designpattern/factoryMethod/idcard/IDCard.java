package com.lamuda.demo.designpattern.factoryMethod.idcard;

import com.lamuda.demo.designpattern.factoryMethod.framework.Product;

/**idcard：加工处理
 * @description:IDCard是一种产品
 * @author: 王斯博
 * @date: 2021-08-12 08:09
 **/
public class IDCard extends Product {

    private String owner;
    private Integer ID;

    public Integer getID() {
        return ID;
    }

    /*
    * 不声明为public，这是因为防止new对象*/
    IDCard(String owner,Integer ID) {
        System.out.println(" 制作 "+ ID +" ,主人为 "+owner + " 的ID卡。 ");
        this.owner = owner;
        this.ID = ID;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void use() {
        System.out.println(" 使用编号为 "+getID()+ " ,主人为" + owner + " 的ID卡。 ");
    }
}
