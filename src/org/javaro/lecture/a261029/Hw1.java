package org.javaro.lecture.a261029;

public class Hw1 {
    static int multiply(int a, int b) {
        return a * b;
    }

    static int rectangle(int a, int b) {
        return a * b;
    }

    static double triangle(int a, int b) {
        return (a * b) / 2.0;
    }

    static class Calc {
        int a;
        int b;

        Calc(int a, int b) {
            this.a = a;
            this.b = b;
        }

        int multiply() {
            return a * b;
        }

        int rectangle() {
            return a * b;
        }

        double triangle() {
            return a * b / 2.0;
        }
    }

    static class CalcBean {
        private int a;
        private int b;

        public CalcBean() {}

        public void setA(int a) {
            this.a = a;
        }

        public void setB(int b) {
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // 절차
        System.out.println("=== 절차 프로그램 ===");
        System.out.println("곱하기: " + (a * b));
        System.out.println("사각형 면적: " + (a * b));
        System.out.println("삼각형 면적: " + (a * b / 2.0));

        // 함수
        System.out.println("=== 함수 프로그램 ===");
        System.out.println("곱하기: " + multiply(a, b));
        System.out.println("사각형 면적: " + rectangle(a, b));
        System.out.println("삼각형 면적: " + triangle(a, b));

        // 객체
        System.out.println("=== 객체 프로그램 ===");
        Calc cal = new Calc(a, b);
        System.out.println("곱하기: " + cal.multiply());
        System.out.println("사각형 면적: " + cal.rectangle());
        System.out.println("삼각형 면적: " + cal.triangle());

        // 자바빈
        System.out.println("=== 자바빈 프로그램 ===");
        CalcBean bean = new CalcBean();
        bean.setA(a);
        bean.setB(b);

        System.out.println("곱하기: " + (bean.getA() * bean.getB()));
        System.out.println("사각형 면적: " + (bean.getA() * bean.getB()));
        System.out.println("삼각형 면적: " + (bean.getA() * bean.getB() / 2.0));
    }
}
