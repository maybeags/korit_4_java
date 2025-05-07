package ch19_generic.wildcards;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AnimalData<T> {
    private T animal;
    /*
        AnimalData의 필드인 animal에 Animal 클래스를 상속받은 Tiger / Human 객체를 필드에 대입할겁니다
        그러면, Car는 들어가면 안될텐데, 현재의 상황으로는 Car가 대입되더라도 Java 상에서 걸러낼 수 없습니다.

        특정 클래스(즉 Animal의 상속을 받은 서브 클래스에 해당된다면) 해당 클래스에 맞는 객체 정보를
        출력할 수 있도록 작성할 예정
     */
    public void printData() {
        ((Animal)animal).move();    // AnimalData의 필드인 animal을 Animal 자료형으로 '형변환'하고,
        // .move() 메서드를 호출  -> 그러면 Car는 .move()가 호출이 안되겠네요.
//        animal.move();    -> 얘는 제네릭을 처리 못하기 때문에 애초에 불가능합니다.

        // 각 클래스들의 고유 메서드들을 호출하기 위한 다운 캐스팅 관련 복습
        if(animal.getClass() == Human.class) {
            ((Human)animal).read(); // animal의 클래스를 확인하여 그것이 Human 클래스에 해당한다면,
            // animal을 다시 Human 클래스로 '다운캐스팅'하여 고유 메서드 .read()를 호출
        } else if (animal.getClass() == Tiger.class) {
            ((Tiger)animal).hunt();
        }   // 추후 다른 Animal의 서브 클래스를 만든다면 else if 로 이어주면 됩니다(했던 부분입니다)
    }
}
