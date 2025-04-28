package ch12_arrays;

import java.util.Arrays;

public class Array08 {
    public static void main(String[] args) {

        // 1차 배열 하나 생성
        String[] students = {"김영", "김일", "김이", "김삼"};
        // 2차 배열 하나 생성
        double[][] scores = {
                {100.0, 96.4},
                {64.2, 79.3},
                {48.1, 99.8},
                {80.2, 4.5}
        };
        // 배열 출력 배우겠습니다
/*
    배열의 출력
    sout(arr) 형태로 배열을 출력하게 되면 배열은 참조변수이기 때문에 주소값만 출력됩니다.
    그리고 반복문을 통해 element를 불러올 수 있습니다(for / enhanced for를 통해).
    하지만 배열 전체를 확인하는 방법은 없었습니다.

    Arrays 클래스를 사용해 정적 메서드 .toString(배열명)을 사용하면 배열 전체 출력 가능.

    이상에서 중요한 점은
    클래스명.메서드명()으로 호출한다는 점입니다. 즉 -> Arrays.toString(배열명);
    즉 저희가 methods 패키지에서 학습했던 것 중에 .메서드명(), 객체명.메서드명()은 수업했었고,
    이번이 처음으로 클래스명.메서드명();

    그리고 toString()이라는 메서드 역시 추후 수업 예정이지만 매우 중요한 개념에 해당합니다.
*/
        // 1. 1차 배열의 출력
        System.out.println(Arrays.toString(students)); // 결과값 : [김영, 김일, 김이, 김삼]
        System.out.println(Arrays.toString(scores));
        // 결과값 : [[D@4c873330, [D@119d7047, [D@776ec8df, [D@4eec7777]

        // 2. 2차 이상의 배열 출력
        // 형식 : Arrays.deepToString(배열명);
        System.out.println(Arrays.deepToString(scores));
        // 결과값 : [[100.0, 96.4], [64.2, 79.3], [48.1, 99.8], [80.2, 4.5]]
    }
}
