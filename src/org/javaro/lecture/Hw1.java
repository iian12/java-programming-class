package org.javaro.lecture;

public class Hw1 {
    public static void main(String[] args) {

        int a = 3;
        System.out.println("a: " + a);
        a = a + 2;
        System.out.println("a + 2: " + a);
        int b = 2;
        a += b;
        System.out.println("b: " + b);
        System.out.println("a + b: " + a);
        a -= b;
        System.out.println("a - b: " + a);
        a *= b;
        System.out.println("a * b: " + a);
        a /= b;
        System.out.println("a / b: " + a);
        a %= b;
        System.out.println("a % b: " + a);
    }

}
