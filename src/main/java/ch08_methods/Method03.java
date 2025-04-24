package ch08_methods;

import java.util.Scanner;

public class Method03 {
    public static void main(String[] args) {
         /*
            실행 예
            몇 과목의 점수를 입력하시겠습니까? >>> 3
            1 과목의 점수를 입력하세요 >>> 100
            2 과목의 점수를 입력하세요 >>> 90
            3 과목의 점수를 입력하세요 >>> 95
            총합은 285.0이며, 평균은 95.0입니다.
          */
        calculateAvgScore();
    }
    public static void calculateAvgScore() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avgScore = 0;
        int numOfSubs = 0;
        System.out.print("몇 과목의 점수를 입력하시겠습니까? >>> ");
        numOfSubs = scanner.nextInt();
        // 반복문
        for (int i = 0 ; i < numOfSubs ; i++) {
            System.out.print((i+1) + " 과목의 점수를 입력하세요 >>> ");
            sum += scanner.nextDouble();
        }
        avgScore = sum / numOfSubs;
        System.out.println("총합은 " + sum + "점이며, 평균은 " + avgScore + "점 입니다.");
    }
}
