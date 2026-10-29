package org.javaro.lecture.a261001;

public class HwSumOneToHunWhile {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        while (i <= 100) {
            sum += i++;
        }
        System.out.println("1부터 100까지 합=" + sum);
    }
}
