package com.lamuda.demo.designpattern.mediator;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * 表示勾选框(单选按钮)的类.实现了Colleague接口
 *
 * @author 王斯博
 * 2022-03-03 11:56
 */
public class ColleagueCheckBox extends Checkbox implements Colleague, ItemListener {

    private Mediator mediator;

    public ColleagueCheckBox(String label, CheckboxGroup group, boolean state) throws HeadlessException {
        super(label, group, state);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
    }
}
