package ch14_abstraction.abstraction_classes;
/*
    지시 사항
    1. Factory 클래스를 상속 받을 것
    2. 그러면 시뻘거 뜨게 될건데 오류들 처리하세요.
    3. TabletFactory의 고유 method인 upgrade(String model)을 call2() 유형으로 정의할 것.
        객체명.upgrade("아이패드 프로 13인치 8세대");로 호출하면
            아이패드 프로 13인치 8세대로 업그레이드합니다. 라고 콘솔에 출력될 수 있도록 작성하시오.


    4. produce() / manage() 메서드를 태블릿 공장에 맞게 적절히 수정할 것(PhoneFactory를 참조)
    5. Main으로 이동해서
        tabletFactory1 객체를 생성하고, 애플 태블릿 공장으로 이름 붙일 것.
    6. produce("아이패드 미니 6세대")를 호출하시오.
    7. manage()를 호출하시오.
    8. upgrade("아이패드 미니 7세대")를 호출하시오.
 */
public class TabletFactory extends Factory{
    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ] 태블릿을 생산합니다.");

    }

    @Override
    public void manage() {
        System.out.println("태블릿 공장을 관리합니다.");
    }

    // 고유메서드 작성
    public void upgrade(String model) {
        System.out.println(model + "으로 업그레이드합니다.");
    }

}
