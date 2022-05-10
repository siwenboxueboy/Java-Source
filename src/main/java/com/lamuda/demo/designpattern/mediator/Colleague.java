package com.lamuda.demo.designpattern.mediator;

/**
 * 定义"组员"API的接口
 *
 * @author 王斯博
 * 2022-03-03 11:55
 */
public interface Colleague {
    // 告知组员 "我是仲裁者,有事请报告我"
    void setMediator(Mediator mediator);

    // 告知组员 仲裁者所下达的指示
    void setColleagueEnabled(boolean enabled);
}
