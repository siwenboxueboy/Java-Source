package com.lamuda.demo.designpattern.facade;

import com.lamuda.demo.designpattern.facade.pagemaker.PageMaker;

/**
 * @author 王斯博
 * 2022-03-03 11:08
 */
public class Main {

    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
    }

}
