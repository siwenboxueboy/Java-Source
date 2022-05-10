package com.siwenboxue.coll;

import java.util.EnumMap;

public class EnumMapTest {
    public static void main(String[] args) {
        EnumMap<PetEnum, String> map = new EnumMap<>(PetEnum.class);
        String value = map.put(PetEnum.Cat, "I like cat");
        System.out.println("value = " + value);
        String remove = map.remove(PetEnum.Cat);
//        抽象类 不能实例化
//        EnumSet<PetEnum> petEnums = new EnumSet<>();
    }
}
