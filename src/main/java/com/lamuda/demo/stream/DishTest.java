package com.lamuda.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-07-26 15:45
 **/
public class DishTest {
    private static List<Dish> menu;
    static {
        menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH) );
    }


    public static void main(String[] args) {

        Entity a = new Entity();
        a.setId(128);
        Entity b = new Entity();
        b.setId(128);
        System.out.println(a.getId() == b.getId());
        System.out.println(a.getId().equals(b.getId()));
       /* List<String> threeHighCaloricDishNames = menu.stream().filter(g -> g.getCalories() > 300).map(Dish::getName).limit(3).collect(toList());

        //可以体现流的执行过程
        List<String> names =
                menu.stream()
                        .filter(d -> {
                            System.out.println("filtering" + d.getName());
                            return d.getCalories() > 300;
                        })
                        .map(d -> {
                            System.out.println("mapping" + d.getName());
                            return d.getName();
                        })
                        .limit(3)
                        .collect(toList());
        System.out.println(names);
        int count = menu.stream()
                .map(d -> 1)
                .reduce(0, (a, b) -> a + b);*/


    }
}
