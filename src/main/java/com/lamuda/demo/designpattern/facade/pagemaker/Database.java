package com.lamuda.demo.designpattern.facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 从邮件地址中获取用户名的类
 *
 * @author 王斯博
 * 2022-03-03 11:13
 */
public class Database {

    // 防止外部new Database
    private Database() {

    }

    public static Properties getProperties(String dbname) {
        String fileName = dbname + ".txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(fileName));
        } catch (IOException e) {
            System.out.println("Warning: " + fileName + " is not found.");
        }
        return properties;
    }

}
