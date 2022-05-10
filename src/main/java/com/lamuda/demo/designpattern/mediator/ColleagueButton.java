package com.lamuda.demo.designpattern.mediator;

import java.awt.*;

/**
 * 表示按钮的类,实现了Colleague接口
 *
 * @author 王斯博
 * 2022-03-03 11:55
 */
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButton(String label) throws HeadlessException {
        super(label);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    // button在这里其实是最末端的操作,没有其他组件和他配合,没必要实现Listener接口

}
