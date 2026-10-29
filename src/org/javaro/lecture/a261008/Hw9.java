package org.javaro.lecture.a261008;

public class Hw9 {
    public static void main(String[] args) {
        String gender = "female";
        System.out.println(fnGender(gender));
        gender = "male";
        System.out.println(fnGender(gender));
    }

    static String fnGender(String gender) {
        if (gender == "female") return "여자";
        else return "남자";
    }
}
