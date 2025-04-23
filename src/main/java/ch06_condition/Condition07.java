package ch06_condition;

import java.util.Scanner;

/*
    중첩 if문(Nested - if)
        if 문 내에 if문이 연속적으로 작성될 수 있습니다.

    형식 :
    if(조건식1) {
        실행문1
        if(조건식1a) {
            실행문1a
        } else if(조건식1b) {
            실행문1b
        } else if(조건식1c) {
            실행문1c
        } else {
            실행문1d
        }
    } else if(조건식2) {
        실행문2
        if(조건식2a) {
            실행문2a
        } else {
            실행문2b
        }
    } else {
        실행문3
        if(조건식3a) {
            실행문3a
        }
    }
 */
public class Condition07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        String grade;
        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();
        // 중첩 if문을 적용한 조건문 작성
        if (score > 100 || score < 0) {
            System.out.println("불가능한 점수 입력입니다.");
            grade = "X";
        } else {                            // 43번 라인의 조건식에 해당되지 않는 score 범위 0<=score<=100
            if (score > 89) {
                grade = "A";
            } else if (score > 79) {
                grade = "B";
            } else if (score > 69) {
                grade = "C";
            } else if (score > 59) {
                grade = "D";
            } else {
                grade = "F";
            }
        }

        System.out.println("당신의 점수는 " + score + "점이고, 학점은 " + grade + "입니다.");









    }
}
