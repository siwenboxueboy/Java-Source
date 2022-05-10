package com.lamuda.demo.designpattern.proxy;

/**
 * 表示带名字的打印机的类(本人)
 *
 * @author 王斯博
 * 2022-03-04 14:11
 */
public class Printer implements Printable {

    private String name;

    public Printer() {
        heavyJob("Generating Printer instance");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("Generating Printer instance (" + name + ")");
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    // 显示带打印机名字的文字
    @Override
    public void print(String string) {
        System.out.println("===" + name + "===");
        System.out.println(string);
    }

    // 重活
    private void heavyJob(String msg) {
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.print(".");
        }
        System.out.println("结束");
    }

}
