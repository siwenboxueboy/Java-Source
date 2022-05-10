package com.lamuda.demo.designpattern.adapter;

/*
* 现有的程序，100V，作用：被适配的角色，
* 我要12V的，被适配的有100V的，它可以转换成12V
* */
public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    /**
     * create by: 王斯博
     * description: ()
     * * @Param: null
     *
     * @return
     */
    public void showWithParen(){
        System.out.println("( " + string + " )");
    }

    /**
     * create by: 王斯博
     * description: **
     * * @Param: null
     *
     * @return
     */
    public void showWithAster(){
        System.out.println("* " + string + " *");
    }
}
