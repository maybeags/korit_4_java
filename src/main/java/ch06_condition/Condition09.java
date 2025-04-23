package ch06_condition;

import java.util.Scanner;

public class Condition09 {
    public static void main(String[] args) {
        // 논리 연산자 사용
        Scanner scanner = new Scanner(System.in);
        System.out.print("연도를 입력하세요 >>> ");
        // 변수 선언 및 초기화 바로 하겠습니다.
        int year = scanner.nextInt();
        String leapYear = "";

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            leapYear = "윤년입니다.";
        } else {          // 여기 조건은 좀 달라집니다. 4로 나누어 떨어지지 않거나 // 100으로 나누어지거나
            leapYear = "윤년이 아닙니다";
        }

        System.out.println(year + "년은 " + leapYear);
    }
}
