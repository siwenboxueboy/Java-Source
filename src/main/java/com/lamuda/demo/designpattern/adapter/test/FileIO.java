package com.lamuda.demo.designpattern.adapter.test;

import java.io.IOException;

/**
 * @description: 要实现的功能
 * @author: 王斯博
 * @date: 2021-07-31 18:11
 **/
public interface FileIO {
    public void readFromFile(String filename) throws IOException;
    public void writeToFile(String filename) throws IOException;
    public void setValue(String key, String value);
    public String getValue(String key);
}
