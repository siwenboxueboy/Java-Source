package com.lamuda.demo.designpattern.chainOfResponsibility;

/**
 * 用来解决问题的抽象类
 *
 * @author 王斯博
 * 2022-03-03 08:28
 */
public abstract class Support {

    private String name; //解决问题的实例名称
    private Support next; // 要推卸给的对象

    // 生成解决问题的实例
    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    @Override
    public String toString() {
        return "[" + name + ']';
    }

    // 未解决
    protected void fail(Trouble trouble){
        System.out.println(trouble + " cannot be resolved.");
    }

    // 已经解决
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");

    }

    // 解决问题的方法
    protected abstract boolean resolve(Trouble trouble);
}
