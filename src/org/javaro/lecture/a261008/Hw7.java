package org.javaro.lecture.a261008;

public class Hw7 {
    public static void main(String[] args) {
        final int N = 15;
        for (int i = -N; i <= N; i++) {
            for (int j = -N; j <= N; j++) {
                if (i * i + j * j <= N * N) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
