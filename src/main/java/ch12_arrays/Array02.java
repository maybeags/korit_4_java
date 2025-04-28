package ch12_arrays;

public class Array02 {
    public static void main(String[] args) {
        // int 배열 선언 및 초기화
        int[] intArr01 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Array01에서 배열의 element를 출력하는 방법은 봤습니다.
        int sum = 0;
        // 이상의 변수를 사용하여 배열 element의 합을 구하는
        // 반복문을 작성하시오.

        for ( int i = 0 ; i < intArr01.length ; i++ ) {
            sum += intArr01[i];
        }
        System.out.println("배열의 합 : " + sum);
        int sumEven = 0;
        // intArr01에서 짝수만 뽑아서 더하려면 어떡하면 될까요?
        for ( int i = 0 ; i < intArr01.length ; i++ ) {
            if(intArr01[i] % 2 == 0) {
                sumEven += intArr01[i];
            }
        }
        System.out.println("짝수의 합 : " + sumEven);

        // 비어있는 배열에(혹은 기존에 값이 있는 배열에) 값을 재대입하는 방법
        int[] intArr02 = new int[100];  // 빈 배열 선언
        intArr02[0] = 100;
        intArr02[1] = 100;
        intArr02[2] = 100;
        intArr02[3] = 100;
        // intArr02에 전부 다 100을 대입해보겠습니다
        for (int i = 0 ; i < intArr02.length ; i++ ) {
            intArr02[i] = 100;
        }

        System.out.println(intArr02[99]);

        // 그러면 저희 intArr02에다가 다시 값을 재대입할건데,
        // 1 ~ 100까지 대입해보겠습니다.
        for ( int i = 0 ; i < intArr02.length ; i++ ) {
            intArr02[i] = (i+1);
        }

        int total = 0;
        // 이상의 변수를 사용하여 intArr02의 모든 element의 합을 구하시오.
        for ( int i = 0 ; i < intArr02.length ; i++ ) {
            total += intArr02[i];
        }
        System.out.println("전체 합 : " + total);

        int total3 = 0;
        // 이상의 변수를 사용하여 intArr02에서 3으로 나누어떨어지는 element의
        // 합을 구하시오.
        for ( int i = 0 ; i < intArr02.length ; i++ ) {
            if( intArr02[i] % 3 == 0 ) {
                total3+=intArr02[i];
            }
        }
        System.out.println("3의 배수의 합 : " + total3);
        // 변수 선언하기 귀찮아서 그냥 0으로 다시 대입해주고 시작하겠습니다.
        total = 0;
        total3 = 0;
        // 이상의 코드 구조를 확인해보면 동일한 반복문이 3 번 쓰였다는 점을
        // 확인할 수 있습니다.
        // 이를 축약시키면
        for ( int i = 0 ; i < intArr02.length ; i++ ) {
            // 값 대입 영역
            intArr02[i] = i+2;                              // 2부터 101까지 더한 합
            // 합 영역
            total += intArr02[i];
            // 3의 배수의 합 구하는 조건문 영역
            if( intArr02[i] % 3 ==0 ) {
                total3 += intArr02[i];
            }
        }
        System.out.println("전체 합 : " + total);
        System.out.println("3의 배수의 합 : " + total3);

    }
}
