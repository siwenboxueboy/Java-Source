package com.lamuda.demo.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-07-26 15:30
 **/
public class Stream1 {

    private static List<String> strs;

    static {
        strs = Arrays.asList("a","abc","abcdef","ab","abcde","   ");
    }



    public static void main(String[] args) {
//        去空 长度大于1 根据长度进行比较并排序 最后搜集
        List<String> collect = strs.stream().filter(e  -> e.length() > 1&& !e.isBlank()).sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
