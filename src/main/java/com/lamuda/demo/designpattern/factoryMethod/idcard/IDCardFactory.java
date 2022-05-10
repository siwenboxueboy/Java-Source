package com.lamuda.demo.designpattern.factoryMethod.idcard;

import com.lamuda.demo.designpattern.factoryMethod.framework.Factory;
import com.lamuda.demo.designpattern.factoryMethod.framework.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-12 08:09
 **/
public class IDCardFactory extends Factory {

    private Map<String, Integer> ownerIds = new HashMap<>();
    private Integer serialNo = 100;

    //    通过生成IDCard实例来 生产产品
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, serialNo++);
    }

    //    通过将IDCard的owner保存到owners字段中来实现“注册产品”
    @Override
    protected void registerProduct(Product product) {
        ownerIds.put(((IDCard) product).getOwner(), ((IDCard) product).getID());
    }


    public Map<String, Integer> getOwnerIds() {
        return ownerIds;
    }
}
