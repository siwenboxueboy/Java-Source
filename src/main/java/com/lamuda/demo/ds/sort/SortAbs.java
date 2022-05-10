package com.lamuda.demo.ds.sort;

import edu.princeton.cs.algs4.StdOut;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-18 08:12
 **/
public abstract class SortAbs {

    public static <T> void sortArray(String method, T... ts){
        StdOut.println("--------------- "+method+" sort --------------");
        T[] t = ts;
        try {
            StdOut.print("排序前数据：");
            show((Comparable[])t);
            Method sort = SortImpl.class.getDeclaredMethod(method, Comparable[].class);
            sort.invoke(null, (T) t);
            StdOut.print("排序后数据：");
            assertAndShow((Comparable[]) t);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
    //v < w compare less return -1 = 0 > 1
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static boolean lessEq(Comparable v, Comparable w) {
        return v.compareTo(w) <= 0;
    }

    //v < w compare less return -1 = 0 > 1
    public static boolean more(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    public static boolean moreEq(Comparable v, Comparable w) {
        return v.compareTo(w) >= 0;
    }

    //交换swap
    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    //交换swap
    public static void exchItem(Comparable a, Comparable b) {
        Comparable t = a;
        a = b;
        b = t;
    }

    // 在单行中打印数组
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }

    // 测试数组元素是否有序
    private static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i - 1])) return false;
        return true;
    }

    public static void assertAndShow(Comparable[] a){
        assert isSorted(a);
        show(a);
    }
}
