package com.lamuda.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-07-26 16:42
 **/
public class NumbersTest {


    private static int[] ints = {1,5,4,14,6,3,6,7,0,8};



    public static void main(String[] args) {
        IntStream stream = Arrays.stream(ints);
//     0 为初始值 执行相加的操作
      //  int reduce = stream.reduce(0, (a, b) -> a + b);
//      第二种写法 sum实现其实就是 a + b
      //  int reduce1 = stream.reduce(0, Integer::sum);
//        第三种写法，不用初始值
        OptionalInt reduce2 = stream.reduce(Integer::sum);
//        如果不为空则进行sout
        reduce2.ifPresent(System.out::println);
//    归约成一个值
      //  System.out.println(reduce);
    }
}
