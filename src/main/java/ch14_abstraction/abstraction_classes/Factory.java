package ch14_abstraction.abstraction_classes;

public abstract class Factory {
    // field 선언
    private String name;

    // 메서드 정의
    public abstract void produce(String model);
    public abstract void manage();
    // 팝업을 확인하면 메서드 본문이라는 부분이 저희가 이야기하는 구현부에 해당합니다.
    /*
        abstract가 메서드의 접근 지정자와 리턴 타입 사이에 명시되면,
        클래스도 동일하게 abstract가 있어야만 합니다.
        추상 클래스의 정의가 -> 추상 메서드가 하나라도 있으면 추상 클래스기 때문에.

        하나'라도'라는 의미는
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*
        추상 클래스 내부에 일반 메서드가 있을 수 있다는 점입니다.
     */
    public void displayInfo() {
        System.out.println("공장 정보를 출력합니다.\n공장 이름 : " + name);
    }
}
