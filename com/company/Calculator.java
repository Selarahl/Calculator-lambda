package com.company;

import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = Integer::sum;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    //Решение № 1
    BinaryOperator<Integer> devide = (x, y) -> x / y;
    //Решение № 2
    //BinaryOperator<Integer> devide = (x, y) -> (y == 0) ? 0 : (x / y);

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
    Consumer<Boolean> printLn = System.out::println;   // для isPositive

}
