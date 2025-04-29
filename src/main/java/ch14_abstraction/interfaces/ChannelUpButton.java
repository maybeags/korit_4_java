package ch14_abstraction.interfaces;

public class ChannelUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("채널을 한 칸 올립니다.");
    }

    @Override
    public String onUp() {
        return "채널을 계속 " + super.onUp();
    }
}
