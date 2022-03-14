package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        calc.println.accept(a);

        int b = calc.minus.apply(1, 1);
        calc.println.accept(b);

        int c = calc.multiply.apply(3, 3);
        calc.println.accept(c);

        try {
            int devide = calc.devide.apply(5, 3);
            calc.println.accept(devide);

            int devideByZero = calc.devide.apply(3, 0);
            calc.println.accept(devideByZero);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }

        int pow = calc.pow.apply(5);
        calc.println.accept(pow);

        int absPositive = calc.abs.apply(5);
        calc.println.accept(absPositive);

        int absNegative = calc.abs.apply(-148);
        calc.println.accept(absNegative);

        Boolean positive = calc.isPositive.test(5);
        calc.printLn.accept(positive);

        Boolean negative = calc.isPositive.test(-150);
        calc.printLn.accept(negative);

    }
}
