package com.lamuda.demo.designpattern.mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * 表示文本输入框的类,实现了Colleague
 *
 * @author 王斯博
 * 2022-03-03 11:56
 */
public class ColleagueTextField extends TextField implements Colleague, TextListener {
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) throws HeadlessException {
        super(text, columns);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ? Color.WHITE : Color.lightGray);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        // 通过此方法可以捕捉到文本内容发生变化这一事件
        // 文本变化 通知仲裁者
        mediator.colleagueChanged();
    }
}
