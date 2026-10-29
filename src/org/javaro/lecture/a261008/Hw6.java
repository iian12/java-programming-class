package org.javaro.lecture.a261008;

public class Hw6 {
    public static void main(String[] args) {
        final int N = 30;
        for (int i = N; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
