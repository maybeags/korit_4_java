package ch12_arrays;

import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];
        int num = 0;
        // 이상의 2차 배열에 1 ~ 100까지 값을 집어넣으시오.

        // Arrays.deepToString(nums); 를 통해 출력하시오.
        // 실행 예
        /*
            [
                [1,2,3,4,5],
                [6,7,8,9,10],
                [11,12,13,14,15],
                [16,17,18,19,20],
                [21,22,23,24,25],
                [26,27 ...],
                ...
                [..., 100]
            ]
         */

        // 입력 파트
        for ( int i = 0 ; i < nums.length ; i++ ) {     // nums.length == 20
            for (int j = 0 ; j < nums[i].length ; j++) {     // nums[i].length == 5
                nums[i][j] = ++num;
            }
        }
        // 출력 파트
        System.out.println(Arrays.deepToString(nums));

        // 향상된 for문으로 출력
        for( int[] numbers : nums ) {
            for( int number : numbers ) {
                System.out.print(number + " / ");
            }
        }

        System.out.println(Arrays.deepToString(nums));

        // ch13_inheritance / Animal / Human / Tiger / Main
















    }
}
