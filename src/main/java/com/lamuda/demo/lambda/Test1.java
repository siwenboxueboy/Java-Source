package com.lamuda.demo.lambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-07-26 14:11
 **/
public class Test1 {


    public void predicate() {
//        行为参数化，返回值为boolean
        Predicate<String> filter = (String s) -> !s.isEmpty();
        System.out.println(filter.test(""));
    }

    public void consumer() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

//        行为参数化,返回值为void
        Consumer<Integer> integerConsumer = (Integer integer) -> System.out.println(integer);
//        执行行为
        integers.forEach(integer -> {
            integerConsumer.accept(integer);
        });
    }

    //    避免了自动装箱和拆箱
    public void consumerInt() {
        int[] ints = {1, 2, 3, 4, 5};
//        行为参数化,返回值为void
        IntConsumer intConsumer = (int i) -> System.out.println(i);
//        执行行为
        for (int anInt : ints) {
            intConsumer.accept(anInt);
        }
    }

    public void funtion() {
//        行为参数化，返回值为Integer
        Function<String, Integer> stringIntegerFunction = (String s) -> s.length();
        List<String> strings = Arrays.asList("a", "abc", "aa");
        ArrayList<Integer> integers = new ArrayList<>();
        strings.forEach(str -> {
            integers.add(stringIntegerFunction.apply(str));
        });
        System.out.println(integers);
    }


    public static void getDay(LocalDate localdate) {
//        某天的第一天和某天的最后一天

        LocalDateTime now = localdate.atStartOfDay();
        LocalDateTime beginDateTime = now;
        LocalDateTime endDateTime = now.withHour(23).withMinute(59).withSecond(59);
        System.out.println(beginDateTime);
        System.out.println(endDateTime);
        System.out.println();
        //某个月的第一天和某个月的最后一天
        beginDateTime = now.with(TemporalAdjusters.firstDayOfMonth()).withHour(0).withMinute(0).withSecond(0);
        endDateTime = now.with(TemporalAdjusters.lastDayOfMonth()).withHour(23).withMinute(59).withSecond(59);
        System.out.println(beginDateTime);
        System.out.println(endDateTime);
        System.out.println();
        //某年的第一天和某年的最后一天
        beginDateTime = now.with(TemporalAdjusters.firstDayOfYear()).withHour(0).withMinute(0).withSecond(0);
        endDateTime = now.with(TemporalAdjusters.lastDayOfYear()).withHour(23).withMinute(59).withSecond(59);
        System.out.println(beginDateTime);
        System.out.println(endDateTime);
    }

    private static final String YEAR_INTERVAL = "year";
    private static final String MONTH_INTERVAL = "month";
    private static final String DAY_INTERVAL = "day";

    private static LocalDateTime getStartLocalDateTime(LocalDate localdate, String interval) {
        if (DAY_INTERVAL.equals(interval)) {
            return localdate.atStartOfDay();
        }
        if (MONTH_INTERVAL.equals(interval)) {
            return localdate.atTime(0, 0, 0).with(TemporalAdjusters.firstDayOfMonth());
        }
        if (YEAR_INTERVAL.equals(interval)) {
            return localdate.atTime(0, 0, 0).with(TemporalAdjusters.firstDayOfYear());
        }
        return null;
    }

    private static LocalDateTime getEndLocalDateTime(LocalDate localdate, String interval) {
        if (DAY_INTERVAL.equals(interval)) {
            return localdate.atTime(23, 59, 59);
        }
        if (MONTH_INTERVAL.equals(interval)) {
            return localdate.atTime(23, 59, 59).with(TemporalAdjusters.lastDayOfMonth());
        }
        if (YEAR_INTERVAL.equals(interval)) {
            return localdate.atTime(23, 59, 59).with(TemporalAdjusters.lastDayOfYear());
        }
        return null;
    }

    public static void main(String[] args) {
//        Test1.getDay(LocalDate.now());
        System.out.println(Test1.getStartLocalDateTime(LocalDate.now(), "year"));
        System.out.println(Test1.getStartLocalDateTime(LocalDate.now(), "month"));
        System.out.println(Test1.getStartLocalDateTime(LocalDate.now(), "day"));
        System.out.println(Test1.getEndLocalDateTime(LocalDate.now(), "year"));
        System.out.println(Test1.getEndLocalDateTime(LocalDate.now(), "month"));
        System.out.println(Test1.getEndLocalDateTime(LocalDate.now(), "day"));

    }
}
