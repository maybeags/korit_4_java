package ch19_generic.wildcards;

public class Tiger extends Animal{
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 걷습니다.");
    }

    public void hunt() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
