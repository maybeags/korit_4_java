package ch09_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        // 기본생성자를 통한 객체 생성
        Constructor constructor1 = new Constructor();
        System.out.println(constructor1.num);
        // int 매개변수 생성자를 통한 객체 생성
        Constructor constructor2 = new Constructor(21);
        System.out.println(constructor2.num);
    }
}
