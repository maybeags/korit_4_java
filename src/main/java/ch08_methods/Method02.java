package ch08_methods;

import java.util.Scanner;

public class Method02 {
    // 한 방에 자기 소개 하는 메서드 정의할겁니다.
    // call1()
    public static void introduce() {
        // 내부에서 Scanner import
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.print("주소를 입력하세요 >>> ");
        String address = scanner.nextLine();
        System.out.println("제 이름은 " + name + "입니다.");
        System.out.println(address + "에 살고 있습니다.");
    }
    /*
        출석부를 만들겁니다.
        메서드 명 : registerStudent()
        return : void

        실행 예
        학번을 입력하세요 >>> 어쩌고
        이름을 입력하세요 >>> 저쩌고
        학번 : 어쩌고
        이름 : 저쩌고

        라고 출력되는 메서드를 정의합니다.

        main 단계에서 학생 수를 입력 받을 겁니다.
        실행 예
        몇 명의 학생을 등록하시겠습니까? >>> 3
        학번을 입력하세요 >>> 20250001
        이름을 입력하세요 >>> 김일
        학번 : 20250001
        이름 : 김일
        학번을 입력하세요 >>> 20250002
        이름을 입력하세요 >>> 김이
        학번 : 20250002
        이름 : 김이
        학번을 입력하세요 >>> 20250003
        이름을 입력하세요 >>> 김삼
        학번 : 20250003
        이름 : 김삼
     */
    public static void registerStudent() {
        // 내부에 Scanner를 따로 import
        Scanner scanner = new Scanner(System.in);
        System.out.print("학번을 입력하세요 >>> ");
        int studentCode = scanner.nextInt();
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.next();
        System.out.println("학번 : " + studentCode);
        System.out.println("이름 : " + name);
    }


    public static void registerStudent2(int count) {
        Scanner scanner = new Scanner(System.in);
        for( int i = 0 ;  i < count ; i++ ) {
            System.out.print("학번을 입력하세요 >>> ");
            int studentCode = scanner.nextInt();
            System.out.print("이름을 입력하세요 >>> ");
            String name = scanner.next();
            System.out.println("학번 : " + studentCode);
            System.out.println("이름 : " + name);
        }
    }

    public static void registerStudent3(int count) {
        for( int i = 0 ;  i < count ; i++ ) {
            registerStudent();      // 메서드 내에 메서드를 호출하는 것이 가능 -> 재사용성의 예시
        }
    }



    public static void main(String[] args) {
        // 여기서는 호출만 할겁니다.
//        introduce();
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        int studentNum = scanner.nextInt();

        // call2() 유형으로 registerStudent2()를 정의할 예정인데,
        registerStudent2(studentNum);    // studentNum이라는 argument가
        // method 정의 시에 for / while문의 한계값으로 사용되어야 한다는 점을 생각하시면 됩니다.






        // 메서드를 반복 실행하기 위한 반복문 작성
        // # 1 for문 사용
//        for (int i = 0 ; i < studentNum ; i++) {
//            registerStudent();
//        }

        // # 2 while문 사용
//        int num = 0;
//        while (num < studentNum) {
//            registerStudent();
//            num++;
//        }
    }
}
