package com.lamuda.demo.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 表示生成和共用BigChar类的实例的类
 *
 * @author 王斯博
 * 2022-03-04 13:47
 */
public class BigCharFactory {
    // BigChar实例池
    private Map<Character, BigChar> pool = new HashMap<>();
    private static BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charName) {
        BigChar bc = pool.get(charName);
        if (bc == null) {
            bc = new BigChar(charName);
            pool.put(charName, bc);
        }
        return bc;
    }

}
