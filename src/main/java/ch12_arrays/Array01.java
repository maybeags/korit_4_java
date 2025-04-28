package ch12_arrays;

public class Array01 {
    public static void main(String[] args) {
        // 배열의 선언 및 초기화
        // 1.
        //자료형[] 배열명 = {값1, 값2, ..., 값n};
        int[] arr1 = { 1, 2, 3, 4, 5 };
        // 값1, ... 값n : element / elem1 = 0;

        // 2. 빈 배열을 선언한 다음에 추후 값을 대입하는 방법
        String[] arr2 = new String[4];  // 방 네 개짜리 빈 배열을 생성
        arr2[0] = "김영";
        arr2[1] = "김일";
        arr2[2] = "김이";
        arr2[3] = "김삼";

        System.out.println(arr1);
        System.out.println(arr2);   // 생각한대로 출력되지 않는다.

        // 배열의 element를 출력하는 방법
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);

        // 어 근데 보니까 [] 안에 있는 값만 바뀌고 반복되네?
        // -> 반복문되겠네?

        for( int i = 0 ; i < 5 ; i++ ) {
            System.out.print(arr1[i] + " ");
        }

        // arr2의 element를 출력하는 반복문을 작성하시오.
        System.out.println();
        for ( int i = 0 ; i < 4 ; i++ ) {
            System.out.println(arr2[i]);
        }

        System.out.println("역순출력");
        // 그러면 역순으로 출력하려면 어떡할 수 있을까요?
        for ( int i = arr1.length - 1 ; i > -1 ; i-- ) {
            System.out.println(arr1[i]);
            // arr1.length - 1로 시작값 설정 이유 :  arr1.length = 5인데
            // 4 3 2 1 0 이 출력되어야하기 때문에 시작값을 4로 만들기 위해
        }

        // arr1에 각 값에 2씩 더하고 싶으면 어떻게 할 수 있을까?
        for ( int i = 0 ; i < arr1.length ; i++) {
            arr1[i] += 2;
            System.out.println(arr1[i]);
        }
        System.out.println("---");
        System.out.println(arr1.length);
        System.out.println(arr2.length);
        // 배열명.length   -> 결과값은 int이 반환됨.
        // -> 객체명.속성명과 동일

        for (int i = 0 ; i < arr2.length ; i++) {
            System.out.print(arr2[i] + " 님 / ");
        }

        // md파일에 정리한대로라면 String은 참조 변수에 해당하고,
        // 참조 변수들을 모아서 다시 배열을 만들었다는 점.
    }
}
