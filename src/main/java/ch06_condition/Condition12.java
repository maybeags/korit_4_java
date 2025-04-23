package ch06_condition;
/*
    Condition07 파일을 확인하시면
    점수를 입력 받아서 등급을 산출을 했었습니다.
    이를 응용하여 중첩 if 문 + switch문 형태로 프로그램을 작성합니다.

    지시 사항
    사용자에게 score를 입력 받아서 다음과 같은 조건을 만족시키도록 작성하시오.
    score가 0미만이거나 100 초과라면 grade = x

    changedScore = 9 ~ 10, grade = A
    changedScore = 8, grade = B
    changedScore = 7, grade = C
    changedScore = 6, grade = D
    changedScore = 5, 4, 3, 2, 1이면 grade = F

    실행 예
    점수를 입력하세요 >>> 100
    점수는 100점이고, 학점은 A학점입니다.
    changedScore = score / 10
 */
public class Condition12 {
    public static void main(String[] args) {
        int score = 0;
        int changedScore = score / 10;

        System.out.println(changedScore);
    }
}
