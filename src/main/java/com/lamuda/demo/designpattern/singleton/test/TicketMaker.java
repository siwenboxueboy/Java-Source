package com.lamuda.demo.designpattern.singleton.test;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-12 09:37
 **/
public class TicketMaker {
    private static int ticket = 1000;

    private TicketMaker() {
        System.out.println("generate a instance...");
    }

    public static int getTicket() {
        return ticket++;
    }


}
