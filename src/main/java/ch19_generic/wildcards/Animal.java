package ch19_generic.wildcards;

public abstract class Animal {
    public abstract void move();
}
/*
    Human / Tiger 클래스는 Animal 클래스를 상속하여
    '사람이 두 발로 걷습니다'
    '호랑이가 네 발로 걷습니다'로 move() 메서드를 구현하시오.

    고유 메서드로
    Human 클래스에 .read() -> '사람이 책을 읽습니다' 출력 -> call1()
    Tiger 클래스에 .hunt() -> '호랑이가 사냥을 합니다' 출력 -> call1()

    Car 클래스는 상속 받지 않고
    .move() -> '차가 움직입니다' 출력 -> call1()
    .brake() -> '차가 멈춥니다' 출력 -> call1()
 */