package com.lamuda.demo.designpattern.builder.test;

public interface Builder {
    /*
     * @description 编写标题
     * @return
     *
     * @param null
     */
    public abstract void makeTitle(String title);

    /*
     * @description 编写字符串
     * @return
     *
     * @param null
     */
    public abstract void makeString(String str);

    /*
     * @description 编写条目
     * @return
     *
     * @param null
     */
    public abstract void makeItems(String[] items);

    /*
     * @description 关闭文件
     * @return
     *
     * @param null
     */
    public abstract void close();
}
