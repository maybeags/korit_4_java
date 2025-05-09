package ch23_lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExample {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello, Java!");
//            }
//        };
//
//        // 이상의 방식으로 익명 클래스를 정의하고,
//        // 메서드를 호출
//        runnable.run();
//
//        // ↑ 이게 기존의 방식이었습니다.
//        Runnable lambdaRunnable = () -> System.out.println("Hello, Java Lambda!");
//        // 이상의 코드가 익명 클래스에서 메서드를 오버라이드해서 재정의하는 부분까지 전부 다 입니다.
//        // 메서드 호출
//        lambdaRunnable.run();

        // 1. Supplier -> call2() 유형의 함수형 인터페이스
        Supplier<String> stringSupplier = () -> "Hello, Functional Interface and Lambda!";
        // 2. Consumer -> call3() 유형의 함수형 인터페이스
        Consumer<String> stringConsumer = (message) -> System.out.println("메시지 : " + message);
        // 3. Supplier로부터 값을 생성하고나서 Consumer를 통해서 출력할겁니다.
        String message = stringSupplier.get();
        // message 변수에 "Hello, Functional Interface and Lambda!" String 데이터가 대입
        stringConsumer.accept(message);
    }
}
