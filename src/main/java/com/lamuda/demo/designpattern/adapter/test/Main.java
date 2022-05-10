package com.lamuda.demo.designpattern.adapter.test;

import java.io.IOException;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-07-31 18:13
 **/
public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("G:\\code\\GitProject\\demo\\src\\main\\java\\com\\lamuda\\demo\\designpattern\\adapter\\test\\file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("G:\\code\\GitProject\\demo\\src\\main\\java\\com\\lamuda\\demo\\designpattern\\adapter\\test\\newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

