package ch05_conversion;

public class Main {
    public static void main(String[] args) {
        // 1. upcasting(업캐스팅) : 더 큰 용량의 자료형으로 변환시키는 것


        char cast1 = 'A';
        System.out.println("원형 : " + cast1);
        // 업캐스팅 방법 # 1
        // 형변환을 하기 위해서는 '(바꿀데이터타입)변수명'으로 작성하시면 됩니다.
        System.out.println("변형 : " + (int)cast1);       // 65가 나중에 문자로 뭔지 물어보는 경우가 있음

        char cast2 = 'a';
        System.out.println("원형 : " + cast2);
        System.out.println("변형 : " + (int)cast2);       // 소문자의 경우는 대문자만큼은 출제되지않지만
                                                         // 외워야 될 필요는 있습니다.

        // 업캐스팅 방법 # 2
        char cast3 = 'b';
        // 새로운 변수를 선언하여 캐스팅이 이루어진 데이터를 집어넣는 방법입니다.
        int casted3 = (int) cast3;
        System.out.println("원형 : " + cast3);
        System.out.println("변형 : " + casted3);
    }
}
