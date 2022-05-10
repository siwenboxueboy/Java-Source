package com.lamuda.demo.designpattern.facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 根据邮件地址编写该用户的Web页面
 *
 * @author 王斯博
 * 2022-03-03 11:13
 */
public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        Properties mailprop = Database.getProperties("maildata");
        String username = mailprop.getProperty(mailaddr);
        try {
            HtmlWriter htmlWriter = new HtmlWriter(new FileWriter(filename));
            htmlWriter.title("Welcome to " + username + "`s page!");
            htmlWriter.paragraph(username + "欢迎来到" + username + "的主页");
            htmlWriter.paragraph("wait your email!");
            htmlWriter.mailto(mailaddr, username);
            htmlWriter.close();
            System.out.println(filename + "is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
