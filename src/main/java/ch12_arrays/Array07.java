package ch12_arrays;
/*
    다차원 배열(Multi Demensional Array) 중 2차원 배열
    : 다차원 배열은 2차원 배열 이상을 의미하지만, 개발 환경 상 2차원 배열 이상을 다루는 경우는
    극히 드물기 떄문에 2차원 배열을 기준으로 강의합니다.

    형식 :
    int[][] arr01 = new int[크기][크기];                  - 선언 방식 # 1
    int[][] arr02 = new int[크기][];                     - 선언 방식 # 2
    int[][] arr03 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };   - 선언 방식 # 3 및 초기화

    2차원 배열의 선언 시, '열'의 크기는 지정하지 않아도 되지만, '행'의 크기는 항상 지정해야 함.
    -> 선언 방식 # 2를 말로 풀어낸 설명입니다.
     1열 2열(column)                      -> 세로줄을 열
      ↓  ↓
    { 1, 2 },   → 1행(row)                -> 가로줄을 행
    { 3, 4 },   → 2행(row)
    { 5, 6 }    → 3행(row)

 */
public class Array07 {
    public static void main(String[] args) {
        int[][] arr03 = {
                { 1, 2 },
                { 3, 4 },
                { 5, 6 }
        };

        // 4를 출력하시오.
        System.out.println(arr03[1][1]);
        System.out.println(arr03[2][0]);

        // 2차 배열에서의 element 출력 방법

        // 잘 생각해보면 1차 배열의 각 element들이 배열입니다.
        // 근데 배열은 참조 변수에 해당했기 때문에 element를 출력하는 것이 불가능합니다.
        // 향상된 for문을 적용한 2차 배열 분해를 해보면
        for ( int[] arr031 : arr03 ) {
            System.out.println(arr031);
            for ( int arr0311 :  arr031) {
                System.out.println(arr0311);
            }
        }
        System.out.println("--이하는 일반 for문으로 작성했습니다--");
        for ( int i = 0 ; i < arr03.length ; i++) {
            System.out.println(arr03[i]);
            for ( int j = 0 ; j < arr03[i].length ; j++) {
                System.out.println(arr03[i][j]);
            }
        }
    }
}
