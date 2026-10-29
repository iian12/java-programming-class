package org.javaro.lecture.a261008;

// 6주 3회차 소수 찾기
public class Hw8 {
    public static void main(String[] args) {
        int n = 30;
        boolean[] isPrime = new boolean[n + 1];

        // 2부터 30까지 소수로 초기화
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 소수 출력
        for (int i = 1; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }

    }
}
