package ch15_casting.control;

public class Tv implements Power{

    @Override
    public void on() {
        System.out.println("Tv의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("Tv의 전원을 끕니다.");
    }

    public void channelUp() {
        System.out.println("채널을 한 칸 올립니다.");
    }
}
