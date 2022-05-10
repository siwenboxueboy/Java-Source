package com.lamuda.demo.designpattern.proxy;

/**
 * Printer和PrinterProxy的共同接口
 * 使得(本人) 和 (代理人) 具有一致性
 * @author 王斯博
 * 2022-03-04 14:21
 */
public interface Printable {
    // 设置名字
    void setPrinterName(String name);

    // 获取名字
    String getPrinterName();

    // 显示文字(打印输出)
    void print(String string);
}
