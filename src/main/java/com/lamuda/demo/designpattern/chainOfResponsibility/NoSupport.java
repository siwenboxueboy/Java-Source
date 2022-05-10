package com.lamuda.demo.designpattern.chainOfResponsibility;

/**
 * 用来解决问题的具体类(永远"不处理问题")
 *
 * @author 王斯博
 * 2022-03-03 08:28
 */
public class NoSupport extends Support{


    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        // 实际方法 : 自己什么也不处理
        return false;
    }
}
