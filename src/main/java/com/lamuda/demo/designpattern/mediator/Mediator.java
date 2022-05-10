package com.lamuda.demo.designpattern.mediator;

/**
 * 定义"仲裁者"的API的接口
 *
 * @author 王斯博
 * 2022-03-03 11:54
 */
public interface Mediator {
    // 生成Mediator要管理的组员 仲裁者和组员双向绑定
    public abstract void createColleagues();

    // 会被各个Colleague组员调用, 可以让组员想仲裁者进行报告
    public abstract void colleagueChanged();
}
