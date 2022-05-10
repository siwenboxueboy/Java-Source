package com.lamuda.demo.designpattern.adapter.test;

import cn.hutool.Hutool;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @description:类适配器
 * @author: 王斯博
 * @date: 2021-07-31 18:09
 **/
public class FileProperties extends Properties implements FileIO {

    @Override
    public void readFromFile(String filename) throws IOException {
        load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        store(new FileOutputStream(filename),"written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key,value);
    }

    @Override
    public String getValue(String key) {
        return getValue(key);
    }
}
