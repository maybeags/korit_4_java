package ch10_setter_getter;

public class Person {
    // 필드 선언
    String name;
    int age;
    // 기본 생성자, 매개변수가 하나인 생성자 두 개, 매개변수 두 개인 매개변수 생성자 하나(name, age순)를
    // 작성하시오.

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
/*
    이제 setAge를 자동완성한 것을 기본으로 두고, 편집할겁니다.
    나이가 0 미만이거나 200 초과인 age가 매개변수로 들어오게 된다면,
    객체의 속성에 들어갈 수 없도록 할 예정입니다.
    md 파일을 참조하여 setAge를 완성하고
    PersonMain에서 person1 객체를 '기본생성자로 생성'하고
    person1.setName("김일");
    person1.setAge(243);을 입력했을 때,
    person1.setAge(21)
    콘솔창의 실행 예시로

    실행 예

    기본 생성자를 통해 Person 클래스의 인스턴스가 생성되었습니다.
    이름이 입력되었습니다. : 김일
    불가능한 나이 입력입니다. 현재 나이 : 0
    나이가 입력되었습니다.
    변경 전 나이 : 0
    변경 후 나이 : 21
 */
    public void setAge(int age) {
        this.age = age;
    }

    // showInfo()도 정의하시오
    // 실행 예
    // 이름 : 김일
    // 나이 : 21
    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}
