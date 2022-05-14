package com;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class java8 {
    public static void main(String[] args) {
        Consumer<String> consumer = (x)->System.out.println(x);

        IntConsumer intConsumer = (x)->System.out.println(x);
        consumer.accept("Yudhi");
        intConsumer.accept(4);
    }

}
