package ch09_classes;

public class ClassA {
    int num;
    String name;

    public void callName() {        // public static void가 아니네요
        System.out.println(name + "을 부릅니다.");
    }
}
