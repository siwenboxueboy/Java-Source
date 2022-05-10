package com.lamuda.demo.designpattern.abstractfactory.factory;

/**
 * @description: 表示抽象工厂的类
 * @author: 王斯博
 * @date: 2021-08-13 14:39
 **/
public abstract class Factory {
    public static Factory getFactory(String classname){
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println(classname + "class file not found");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption,String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title,String author);
    // 可以继续扩展其他的组件...

}
