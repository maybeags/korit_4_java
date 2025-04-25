package ch09_classes;
/*
    생성자(Constructor)
        : 객체가 생성될 때 호출되는 '특별한' 메서드
    클래스명        객체명 = new 클래스명();
    ClassExample example = new ClassExample();
    : 근데 사실 ClassExample()이 생성자였습니다.

    특징 :
        1. 클래스의 이름과 생성자의 이름은 동일하다.
            (다른 메서드와 달리 대문자로 시작하고 / 명사일 확률이 높다)
        2. return 값이 없다 -> call1() / call2() 유형으로 볼 수 있습니다.
        3. 객체 초기화 : 생성자는 객체의 필드 초기화를 담당한다.

    생성자 정의 방식
        1. 기본 생성자 : 매개변수가 없는 생성자
            (사실 클래스를 만들 때 default로 생성되어 정의하지 않을 때가 있습니다
                -> 저희는 Car 클래스에서 생성자를 정의한 적 없지만
                    CarMain에서 객체를 생성할 수 있었던 점에서 알 수 있습니다 -> 복습!!!!)
        2. 매개변수 생성자 : 하나 이상의 매개변수를 가지는 생성자
 */
public class Constructor {
    // 필드 선언
    int num;
    String name;

    // 기본 생성자를 정의하면 해당 형태
    Constructor() {
        System.out.println("기본생성자를 통해 객체가 생성되었습니다.");
        System.out.println("NoArgsConstructor");
    };

    // 매개변수 생성자 # 1
    Constructor(int number) {
        System.out.println("int 매개변수를 필수로 요구하는 매개변수 생성자로 객체를 생성");
        System.out.println("RequiredArgsConstructor");
        this.num = number; // argument로 받은 int 자료형의 데이터를 이 클래스의 필드인
        // num에 대입하겠다는 의미로
        // this는 해당 클래스에서 객체를 만들게 되면 객체 이름으로 대체되는 임시 이름.
    };

    // 매개변수 생성자 # 2
    Constructor(String title) { // 추후에는 매개변수명과 속성명을 일치시킬겁니다.
        this.name = title;
        System.out.println("String 매개변수를 필수로 요구하는 매개변수 생성자로 객체를 생성");
        System.out.println("RequiredArgsConstructor");
    }

    // 매개변수 생성자 # 3
    Constructor(int num, String name) {
        this.num = num;
        this.name = name;
        System.out.println("모든 필드를 필수로 요구하는 매개변수 생성자");
        System.out.println("AllArgsConstructor");
    }

    Constructor(String name, int num) {
        this.num = num;
        this.name = name;
        System.out.println("모든 필드를 필수로 요구하는 매개변수 생성자");
        System.out.println("AllArgsConstructor");
    }

    // 메서드도 정의해보겠습니다.
    void displayInfo() {
        System.out.println("이 객체의 num 값 : " + num);
        System.out.println("이 객체의 name 값 : " + name);
    }
}
