package ch22_exception;

public class Exception1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result1 = a / b;
            System.out.println("결과 : " + result1);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다. : " + e.getMessage());
        } finally {
            System.out.println("프로그램 정상 종료");
        }

        // 배열 인덱스 예외
        int[] numbers = {1,2,3};
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {                 // 예외 중 가장 상위 예외 클래스가 Exception입니다.
            throw new RuntimeException(e);
        } finally {
            System.out.println("프로그램 정상 종료");
        }

    }
}
