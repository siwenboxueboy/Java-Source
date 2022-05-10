package com.lamuda.demo.designpattern.proxy;

import java.util.Objects;

/**
 * 表示带名字的打印机的类(代理人)
 *
 * @author 王斯博
 * 2022-03-04 14:13
 */
public class PrinterProxy implements Printable {

    // 名字
    private String name;

    // 本人
    private Printer real;

    public PrinterProxy(String name) {
        this.name = name;
    }

    // 设置名字
    @Override
    public synchronized void setPrinterName(String name) {
        if (Objects.nonNull(real)) {
            // 给(本人)也设置名字
            real.setPrinterName(name);
        }
        this.name = name;
    }

    // 获取名字
    @Override
    public String getPrinterName() {
        return name;
    }

    // 显示
    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    // 生成本人
    private synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }

}
