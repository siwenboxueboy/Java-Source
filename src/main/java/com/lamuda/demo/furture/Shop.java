package com.lamuda.demo.furture;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-14 16:03
 **/
public class Shop {
    private Random random = new Random();

    //API 这个API的使用者，调用时会被阻塞
    public double getPrice(String product) {
        return calculatePrice(product);
    }

    //用异步方式返回
    public Future<Double> getPriceAsync(String product) {
//        会包含计算的结果
        CompletableFuture<Double> futurePrice = new CompletableFuture<>();
        new Thread( () -> {
            double price = calculatePrice(product);
            futurePrice.complete(price);
        }).start();
        return futurePrice;
    }

    public Future<Double> getPriceAsync1(String product) {
        return CompletableFuture.supplyAsync(() -> calculatePrice(product));
    }

    private double calculatePrice(String product) {
        delay();
        return random.nextDouble() * product.charAt(0) + product.charAt(1);
    }

    public static void delay() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
