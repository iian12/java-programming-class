package org.javaro.lecture.a261001;

public class HwPrintGenderWithoutUpperCase {

    public static void main(String[] args) {
        String gender = "Male";
        if (gender.equalsIgnoreCase("male")) {
            System.out.println("남자");
        } else {
            System.out.println("남자아님");
        }
    }
}