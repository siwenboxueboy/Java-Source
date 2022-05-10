package com.siwenboxue.coll;

public enum PetEnum {
    Rabbit(0, "兔子"),
    Dog(1, "狗"),
    Cat(2, "猫");

    private final int value;
    private final String dispalyName;

    PetEnum(int value, String dispalyName) {
        this.value = value;
        this.dispalyName = dispalyName;
    }

    public int getValue() {
        return value;
    }

    public String getDispalyName() {
        return dispalyName;
    }
}
