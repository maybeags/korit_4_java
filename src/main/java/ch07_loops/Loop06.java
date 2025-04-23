package ch07_loops;
/*
    for (int i = 0 ; i < 10 ; i ++) {
        (반복실행문1-a)
        for(int j = 0 ; j < 10 ; j ++) {
            반복실행문2
        }
        (반복실행문1-b)
        for(int k = 0 ; k < 10 ; k++) {
            반복실행문3
        }
        (반복실행문1-c)
    }

    *
    **
    ***
    ****
    *****


    *****
    ****
    ***
    **
    *

    몇 줄의 별을 찍겠습니까? >>> 3
    *
    **
    ***
 */
public class Loop06 {
    public static void main(String[] args) {
        for( int i = 1 ; i < 6 ; i++) {
            for(int j = 0 ; j < i ; j++) {
                System.out.print("😊");              // 별이 한 번에 여러 번 찍힐 수 있기 때문에 print
            }
            System.out.println();                   // 개행이 일어나는 1차 for 문
        }
//        System.out.println("Hello, Java");
    }
}
