package com.lamuda.demo.lambda;


/**
 * @description:
 * @author: 王斯博
 * @date: 2021-07-26 15:01
 **/
public class TriFunTest {
    public static void main(String[] args) {
//        构造函数引用
        TriFunction<Integer, Integer, Integer, Color> colorFactory = Color::new;
        Color apply = colorFactory.apply(1, 2, 3);
        Color apply1 = colorFactory.apply(1, 2, 3);
        System.out.println(apply == apply1);//is false,create different object
        System.out.println(apply);
    }
}

class Color {
    private int i;
    private int j;
    private int k;

    Color() {
    
    }

    @Override
    public String toString() {
        return "Color{" +
                "i=" + i +
                ", j=" + j +
                ", k=" + k +
                '}';
    }
    //构造函数
    public Color(Integer integer, Integer integer1, Integer integer2) {
        this.i = integer;
        this.j = integer1;
        this.k = integer2;
    }


    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public int getK() {
        return k;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setK(int k) {
        this.k = k;
    }

    public void setJ(int j) {
        this.j = j;
    }
}