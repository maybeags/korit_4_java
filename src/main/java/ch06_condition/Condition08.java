package ch06_condition;

import java.util.Scanner;

/*
    과제 :
    윤년 계산기 작성
    윤년(leap year)은 특정 조건을 만족하는 년을 의미합니다.

    윤년을 판단하는 규칙은
    1. 연도가 4로 나누어 떨어지는 해는 윤년에 해당할 '수도 있음'
    2. 그러나 100으로 나누어 떨어지는 해는 윤년이 아님
    3. 근데 100으로 나누어 떨어지긴 하는데 400으로도 나누어 떨어지면 윤년에 해당함.

    예를 들어,
    2020년은 4로 나누어 떨어지므로 윤년입니다(100으로 나누어떨어지지 않습니다)
    1900년은 100으로 나누어 떨어지기 때문에 윤년이 아닙니다(400으로 나누어 떨어지지 않습니다)
    2000년은 100으로 나누어 떨어지지만 400으로도 나누어 떨어지기 때문에 윤년에 해당합니다.
 */
public class Condition08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        System.out.print("연도를 입력하세요 >>> ");
        year = scanner.nextInt();
        // 입력 받은 year가 윤년에 해당하는지 판단하는 조건문을 작성하시오.
    }
}
