package ch06_condition;

import java.util.Scanner;

/*
    if - else if문 : if - else문과 달리 else if에는 별도의 조건식이 요구됨.
        그리고 else if는 여러 개 나올 수 있습니다.

    형식 :
    if(조건식1) {
        실행문1
    } else if(조건식2) {
        실행문2
    } else if(조건식3) {
        실행문3
    }
 */
public class Condition03 {
    public static void main(String[] args) {
        // Scanner 클래스 import
        Scanner scanner = new Scanner(System.in);

        // 변수 / 상수의 선언 및 초기화
        int point = 0;
        final int VIP_POINT = 80;       // final 키워드가 붙으면 재대입이 불가능함.
        final int GOLD_POINT = 60;      // 즉 변함없는 데이터를 사용하고 싶을 때
        final int SILVER_POINT = 40;    // 사용하는데, 얘가 변함없는 데이터라는 것을
        final int BRONZE_POINT = 20;    // 개발자들이 알아보기 위해 대문자로만 작성

        System.out.print("회원 포인트를 입력하세요 >>> ");
        point = scanner.nextInt();

        // 조건문
//        if (point > 80) {
//            System.out.println("회원 등급 : VIP");
//        } else if (point > 60) {
//            System.out.println("회원 등급 : GOLD");
//        } else if (point > 40) {
//            System.out.println("회원 등급 : SILVER");
//        } else if (point > 20) {
//            System.out.println("회원 등급 : BRONZE");
//        } else if (point <= 20) {
//            System.out.println("회원 등급 : NORMAL");
//        }

        // 반복되는 부분이 너무 많은 것 같아서 줄이겠습니다.
        // 등급을 저장하는 변수를 하나 선언하겠습니다.
        String userGrade = "";          // 데이터에 아직 아무런 값이 없습니다.
        if (point > 80) {
            userGrade = "VIP";          // userGrade에 VIP라는 String 데이터를 재대입
        } else if (point > 60) {
            userGrade = "GOLD";
        } else if (point > 40) {
            userGrade = "SILVER";
        } else if (point > 20) {
            userGrade = "BRONZE";
        } else if (point <= 20) {
            userGrade = "NORMAL";
        }

        System.out.println("회원 등급 : " + userGrade);

        // if - else / if - else if문의 경우 전체가 한 세트의 조건문으로 볼 필요가 있습니다.
    }
}
