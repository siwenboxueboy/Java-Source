package com.lamuda.demo.designpattern.command.command;


import java.util.Iterator;
import java.util.Stack;

/**
 * 表示"由多条命令整合成的命令"的类
 *
 * @author 王斯博
 * 2022-03-04 15:01
 */
public class MacroCommand implements Command {

    // 命令栈
    private Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {
        Iterator it = commands.iterator();
        while (it.hasNext()) {
            ((Command) it.next()).execute();
        }
    }

    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }

    public void undo() {
        if (!commands.isEmpty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}
