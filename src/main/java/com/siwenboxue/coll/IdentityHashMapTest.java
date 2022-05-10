package com.siwenboxue.coll;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

public class IdentityHashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("a", "2");
        map.put("a", "3");
        System.out.println(map.size()); //1
//        我们发现他俩String,Integer 都重写了此方法，并且只和value值有关。因此只要内容相同，他们的hashCode就是相等的
//        普通对象使用的父类Object的HashCode方法，是个native方法，与地址值有关，因此new出来的对象肯定不是同一个key了
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(new String("a"), "1");
        hashMap.put(new String("a"), "2");
        hashMap.put(new String("a"), "3");
        System.out.println(hashMap.size()); //1

        Map<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(new Integer(200), "1");
        hashMap2.put(new Integer(200), "2");
        hashMap2.put(new Integer(200), "3");
        System.out.println(hashMap2.size()); //1

        Map<Demo, String> hashMap3 = new HashMap<>();
        hashMap3.put(new Demo(1), "1");
        hashMap3.put(new Demo(1), "2");
        hashMap3.put(new Demo(1), "3");
        System.out.println(hashMap3.size()); //3
//        key是否相同，取决于HashCode是否相等


        //IdentityHashMap使用===================================
        Map<String, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(new String("a"), "1");
        identityHashMap.put(new String("a"), "2");
        identityHashMap.put(new String("a"), "3");
        System.out.println(identityHashMap.size()); //3

        Map<Demo, String> identityHashMap2 = new IdentityHashMap<>();
        identityHashMap2.put(new Demo(1), "1");
        identityHashMap2.put(new Demo(1), "2");
        identityHashMap2.put(new Demo(1), "3");
        System.out.println(identityHashMap2.size()); //3

        System.out.println(identityHashMap.get("a")); //null
        System.out.println(identityHashMap2.get(new Demo(1))); //null
    }

    private static class Demo {
        private int val;

        public Demo(int val) {
            this.val = val;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Demo demo = (Demo) o;
            return val == demo.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val);
        }
    }
}
