package ch15_casting.animals;

public class Main {
    public static void main(String[] args) {
        // 객체 생성
        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1.fetch();

        // 업캐스팅
        Animal animal1 = new Dog(); // 방법 # 1 A a = new B();
        // -> 시험에자주나옴
        animal1.makeSound();
        // 결과값 :
        // 동물이 소리를 냅니다.
        // 강아지가 짖습니다.
        // Animal animal2 = new Animal();에서
        // animal2.makeSound(); 의 결과값과의 차이점을 명확히 알아야 합니다.

        Animal animal2 = dog1;      // 방법 # 2 // 위에서 생성한 dog1 객체를 대입했습니다.
        animal2.makeSound();
        // 결과값 :
        // 동물이 소리를 냅니다.
        // 강아지가 짖습니다.
//        animal2.fetch();  오류 발생
        dog1.fetch();

        // instanceof 연산자 사용 예시
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);                    // true
        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2);                    // true
        // instanceof의 결과값이 true : 확인하고자 하는 object가 해당 클래스의 인스턴스이거나 '하위 클래스'의
        // 인스턴스 일 때.
        boolean result3 = dog1 instanceof Dog;
        System.out.println(result3);                    // true
        boolean result4 = dog1 instanceof Animal;
        System.out.println(result4);                    // true

        System.out.println("animal2는 animal1이랑 사실상 같다고 아까 수업해서 Animal 인스턴스 하나 생성");
        Animal animal3 = new Animal();
        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5);                    // true
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6);                    // false

        System.out.println("↑ 업캐스팅 관련 수업입니다.");
        System.out.println("↓ 다운캐스팅 관련 수업할겁니다");
        /*
            업캐스팅의 경우에는 암시적으로 이루어집니다. 그래서 A a = new B(); 보고 대충 업캐스팅됐구나
            생각해야하는 반면
            (클래스명)객체명; 과 같이 다운캐스팅은 명시적으로 이루어져야합니다.
            -> (int)2.3; 과 같은 방식으로. -> ch03_conversion 참조
         */
//        animal2.fetch();  -> 56번 라인과의 비교를 위해 남겨둡니다.
        Dog dog2 = (Dog) animal2;   // 다운캐스팅 방법
        dog2.makeSound();
        dog2.fetch();
        animal2.makeSound();
        ((Dog) animal2).fetch();    // 56번 라인이 있기 때문에 자동완성으로 바로 다운캐스팅이 이루어집니다.

//        Dog dog3 = (Dog) animal3;
//        dog3.makeSound();
        /*
            62번 라인과 63번 라인은 남겨두었을 때 오류가 발생하지 않는데
            실행시키니까 오류가 발생한다는 차이점이 있습니다.

            이유 :
                애초에 animal3를 생성할 때 new Animal();로 생성했기 때문에 다운캐스팅이 불가능합니다.
            즉 다운 캐스팅의 전제 조건은
            A a = new B();에서 출발한다는 점을 확인할 수 있습니다.

            그래서 지금 경우의 수가 animal**이라는 객체가 있을 때 걔가 Animal() 생성자로 생성됐는지
            Dog() 생성자로 생성됐는지에 따라 우리 프로그램이 오류가 날 수도 있고 안 날 수도 있는
            양자역학 상황이라는 점입니다.
         */

        Animal animal4 = new Dog();
        System.out.println("animal4 검증 파트");
        if (animal4 instanceof Dog) {   // 얘가 true라면 animal4 객체는 Animal animal4 = new Dog();로 생성됨
            Dog dog4 = (Dog) animal4;   // 그래서 다운캐스팅이 가능하다.

            dog4.makeSound();
            dog4.fetch();           // 특히 얘를 실행시키더라도 오류가 발생하지 않는다.
        }

        System.out.println("animal3도 검증합니다");
        if (animal3 instanceof Dog) {
            Dog dog3 = (Dog) animal3;

            dog3.makeSound();
            dog3.fetch();
        } else {
            System.out.println("불가능한 다운캐스팅입니다.");
        }







    }
        // animals. 를 지우고 control 패키지 생성
        // Main / CentralControl / Computer / Power->얘는 인터페이스
}
