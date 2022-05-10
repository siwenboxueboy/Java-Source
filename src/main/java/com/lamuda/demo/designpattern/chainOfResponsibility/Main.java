package com.lamuda.demo.designpattern.chainOfResponsibility;

/**
 * 制作职责链,并且制造问题,测试问题行为
 *
 * @author 王斯博
 * 2022-03-03 08:30
 */
public class Main {
    public static void main(String[] args) {
        // 生成六个解决问题的实例
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana", 200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 300);
        // 调用setNext 讲六个实例串联 形成职责链
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
        // 生成问题,传递给第一个实例,然后显示谁最终解决了该问题
        for (int i = 0; i < 500; i += 33) {
            alice.support(new Trouble(i));
        }
    }
}
