package com.lamuda.demo.designpattern.command.drawer;

import com.lamuda.demo.designpattern.command.command.Command;

import java.awt.*;

/**
 * 表示"绘制一个点的命令"的类
 *
 * @author 王斯博
 * 2022-03-04 14:59
 */
public class DrawCommand implements Command {
    // 绘制对象
    protected Drawable drawable;
    // 绘制位置
    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
