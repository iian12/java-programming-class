package org.javaro.lecture.a261008;

public class Ex4_5 {
    public static void main(String[] args) {
        int b = 2;
        for (int i = 0; i < 5; i++) {
            if (i == b) continue;
            System.out.println("i=" + i);
        }
    }
}
