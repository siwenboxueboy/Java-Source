package com.lamuda.demo.stream.traders;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-07-26 17:10
 **/
public class TraderTest {
    Trader raoul = new Trader("Raoul", "Cambridge");
    Trader mario = new Trader("Mario","Milan");
    Trader alan = new Trader("Alan","Cambridge");
    Trader brian = new Trader("Brian","Cambridge");

    List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    public static void main(String[] args) {
        TraderTest traderTest = new TraderTest();

        var str = "d";
        var s = new TraderTest();

//找到交易额最小的交易
//        Transaction transaction = traderTest.transactions.stream().reduce((a, b) -> a.getValue() < b.getValue() ? a : b).get();
//        System.out.println(transaction);
//        Transaction transaction1 = traderTest.transactions.stream().min(Comparator.comparing(Transaction::getValue)).get();
//        System.out.println(transaction1);

//        所有交易中，最高的交易额是多少
//        Integer integer = traderTest.transactions.stream().map(Transaction::getValue).reduce(Integer::max).get();
//        System.out.println(integer);


        // 打印生活在剑桥的交易员的所有交易额
//        traderTest.transactions.stream().filter(e -> e.getTrader().getCity().equals("Cambridge")).map(Transaction::getValue).forEach(System.out::println);

//        找出2011年的所有交易并按交易额排序（从低到高）
//        List<Transaction> collect = traderTest.transactions.stream().filter(e -> e.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).collect(toList());
//        System.out.println(collect);
//        交易员都在哪些不同的城市工作过
//        List<String> collect1 = traderTest.transactions.stream().map(e -> e.getTrader().getCity()).distinct().collect(toList());
//        System.out.println(collect1);
//        写法二 直接转换成set接收
//        Set<String> collect2 = traderTest.transactions.stream().map(e -> e.getTrader().getCity()).collect(Collectors.toSet());
//        System.out.println(collect2);

//        查找所有来自于剑桥的交易员，并按姓名排序
//        Set<Trader> cambridge = traderTest.transactions.stream().filter(e -> e.getTrader().getCity().equals("Cambridge")).sorted(Comparator.comparing(p -> p.getTrader().getName())).map(Transaction::getTrader).collect(Collectors.toSet());
//        System.out.println(cambridge);

//       返回所有交易员的姓名字符串，按字母顺序排序
//        String collect3 = traderTest.transactions.stream().map(e -> e.getTrader().getName()).distinct().sorted().collect(Collectors.joining());
//        System.out.println(collect3);

//      有没有交易员是在米兰工作的
//        Set<Trader> collect = traderTest.transactions.stream().map(e -> e.getTrader()).filter(e -> "Milan".equals(e.getCity())).collect(Collectors.toSet());
//        System.out.println(collect);
    }
}
