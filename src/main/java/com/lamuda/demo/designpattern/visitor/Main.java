package com.lamuda.demo.designpattern.visitor;


import java.util.Iterator;

/**
 * @description:测试程序行为的类
 * @author: 王斯博
 * @date: 2021-08-16 15:19
 **/
public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 10000));
            bindir.add(new File("latex", 20000));
            //rootdir.accept(new ListVisitor());

            FileFindVisitor fileFindVisitor = new FileFindVisitor(".html");

            System.out.println("");
            System.out.println("Making user entries...");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);
            yuki.add(new File("diary.html", 100));
            yuki.add(new File("Composite.java", 200));
            hanako.add(new File("memo.txt", 300));
            tomura.add(new File("game.doc", 400));
            rootdir.accept(new ListVisitor());

/*            rootdir.accept(fileFindVisitor);
            Iterator it = fileFindVisitor.getFoundFiles();
            while (it.hasNext()) {
                File next = (File) it.next();
                System.out.println(next.toString());
            }*/

            SizeVisitor sizeVisitor = new SizeVisitor();
            rootdir.accept(sizeVisitor);
        } catch (FileTreatementException e) {
            e.printStackTrace();
        }
    }
}
