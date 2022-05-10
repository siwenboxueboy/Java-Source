package com.lamuda.demo.designpattern.builder;

/**
 * @description:定义了决定文档结构的抽象类,抽象出了构建对象的基本动作，构建不同的对象需要不同的Bulder实现
 * @author: 王斯博
 * @date: 2021-08-12 11:32
 **/
public abstract class Builder {
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
