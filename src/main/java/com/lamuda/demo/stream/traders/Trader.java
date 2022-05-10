package com.lamuda.demo.stream.traders;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-07-26 17:07
 **/
public class Trader {
    private final String name;
    private final String city;


    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String toString(){
        return "Trader:"+this.name + " in " + this.city;
    }
}
