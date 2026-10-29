package org.javaro.lecture.a261001;

public class HwPrintBool {
    public static void main(String[] args) {
        int a = 100, b = 100;
        System.out.println("a와 b는 같은 크기?" + (a == b));
        System.out.println("a가 b보다 큰가요?" + (a > b));
        System.out.println("a=b이고 a > 30인가요?" + ((a == b) && (a > 30)));
        System.out.println("a가 50이 아닌가요?" + !(a==50));
    }
}
