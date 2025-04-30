package ch15_casting.control;

public class SmartPhone implements Power{
    @Override
    public void on() {
        System.out.println("스마트폰의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("스마트폰의 전원을 끕니다.");
    }

    public void touchScreen() {
        System.out.println("스크린을 터치합니다.");
    }
}
