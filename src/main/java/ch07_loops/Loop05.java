package ch07_loops;

public class Loop05 {
    public static void main(String[] args) {
        // 1일차 1교시입니다 ~ 5일차 3교시입니다
        for ( int i = 1 ; i < 6 ; i++) {
            for(int j = 1 ; j < 4 ; j++) {
                System.out.println(i + "일차 " + j + "교시입니다.");
            }
        }

        // 이상의 코드를 응용하여 구구단을 출력하시오.
        for ( int i = 2 ; i < 10 ; i++) {
            for(int j = 1 ; j < 10 ; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }
        /*
            1 2 3 4 5 6 7 8 9 10
            ...
            91 92 93 94 95 96 97 98 99 100
         */
        // 반복 100번 하는 방법
//        for (int i = 1 ; i < 101 ; i++) {
//            System.out.print(i + " ");
//            if(i % 10 == 0) {
//                System.out.println();
//            }
//        }

        // 반복 10번 하는 방법
        for(int i = 1 ; i < 101 ; i+=10) {
            System.out.println(i + " " + (i+1) + " " + (i+2) + " " + (i+3) + " " + (i+4) + " "
                    + (i+5) + " " + (i+6) + " " + (i+7) + " " + (i+8) + " " + (i+9) + " "
            );
        }

        // Loop06 -> main


    }
}
