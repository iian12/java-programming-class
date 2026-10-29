package org.javaro.lecture.a261001;

public class HwPrintGenderWithSwitchCase {
    public static void main(String[] args) {
        String gender = "Male";

        switch (gender) {
            case "Male":
                System.out.println("남자");
                break;
            default:
                System.out.println("남자아님");
        }
    }
}
