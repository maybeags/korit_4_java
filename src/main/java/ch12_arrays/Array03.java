package ch12_arrays;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        // 비어있는 String 배열을 10개짜리를 만들겁니다.

        // 0번지에 김영 1번지에 김일 ... 3번지에 김삼까지
        // Scanner로 입력할 수 있도록 작성하겠습니다.
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[4];

        // 주소지에 값을 대입하기 위한 반복문 작성
        for ( int i = 0 ; i < names.length ; i++ ) {
            System.out.print( i + 1 + "번 째 학생 입력 >>> ");
            names[i] = scanner.nextLine();
        }
        // 출력을 깔끔하게 하기 위해서는 입력과 출력 반복문을 따로 작성하는 것이
        // 낫습니다.
        for ( int i = 0 ; i < names.length ; i++ ) {
            System.out.print(i + 1 + "번 째 학생 출력 : " + names[i] + " ");
        }

    }
}
