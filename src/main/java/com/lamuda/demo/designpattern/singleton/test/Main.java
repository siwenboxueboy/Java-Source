package com.lamuda.demo.designpattern.singleton.test;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-12 09:39
 **/
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(TicketMaker.getTicket());
        }
    }
}
