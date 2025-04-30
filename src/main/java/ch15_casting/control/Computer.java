package ch15_casting.control;

public class Computer implements Power {
    @Override
    public void on() {
        System.out.println("컴퓨터의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("컴퓨터의 전원을 끕니다.");
    }

    // 추후 다시 다운캐스팅을 한 이후에 실행할 고유 메서드
    public void compute() {
        System.out.println("컴퓨터가 연산을 수행합니다.");
    }
}
