package org.javaro.lecture.a261001;

public class Ex4_2 {
    public static void main(String[] args) {
        int x = 11;
        int End = 15;
        do {
            System.out.println("x=" + x + ", End=" + End + "," + (x <= End));
            x++;
        } while (x <= End);
    }
}
