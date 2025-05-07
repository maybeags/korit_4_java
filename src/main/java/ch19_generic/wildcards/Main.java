package ch19_generic.wildcards;

public class Main {

    // AnimalData의 필드가 Animal의 서브 클래스에 해당하는지 확인하는 메서드를 정의
    // wildcard가 적용되기 때문에 주의깊게 보시기 바랍니다.
    public AnimalData<? extends Animal> getAnimal(int flag) {
        if(flag == 1) {
            AnimalData<Human> animalData1 = new AnimalData<>(new Human());
            return animalData1;
        } else if (flag == 2) {
            AnimalData<Tiger> animalData2 = new AnimalData<>(new Tiger());
            return animalData2;
        }
        return null;
    }


    public static void main(String[] args) {
//        AnimalData<Tiger> animalData1 = new AnimalData<>(new Tiger());
//        AnimalData<Human> animalData2 = new AnimalData<>(new Human());
//        AnimalData<Car> animalData3 = new AnimalData<>(new Car());
//
//        animalData1.printData();
//        System.out.println("---");
//        animalData2.printData();
//        System.out.println("---");
//        animalData3.printData();
        /*
            28번 라인에서 오류가 생긴다는 점을 확인할 수 있습니다.
            AnimalData 클래스의 .printData() 메서드를 호출하는 과정에서
            Car 객체(AnimalData의 필드인)를 강제로 Animal 클래스로 형변환하려고 했기 때문에 발생하는 예외인데
            결국 필드에 Car 객체가 대입은 되지만 메서드는 호출되지 않는다는 점을 확인할 수 있습니다.

            그렇다면 애초에 Car 객체가 필드에 대입되지 못하도록 설정할 필요성이 대두되었는데,
            이 것이 와일드 카드 개념의 의의입니다.
         */

        // Main에 메서드 정의했으니까 Main 객체를 생성하겠습니다.
        Main main = new Main();
        AnimalData<? extends  Animal> animalData4 = main.getAnimal(1);
        AnimalData<? extends  Animal> animalData5 = main.getAnimal(2);
        AnimalData<? extends  Animal> animalData6 = main.getAnimal(3);

        // 이상의 코드를 작성했을 때 생성자를 통해서 객체 생성을 하지 않았다는 점,
        // 저희가 직접 getAnimal() 메서드를 정의하지 않았다면 어떤 클래스의 객체가 argument로 들어갔는지
        // 모른다는 점 등의 잠재적인 문제가 있습니다.

        // 그래서 오류를 발생시키지않기 위해 조건문을 작성해보겠습니다.
        if (animalData4 != null) {
            animalData4.printData();
        } else {
            System.out.println("필드에 대입된 값이 없습니다.");
        }
        if (animalData5 != null) {
            animalData5.printData();
        } else {
            System.out.println("필드에 대입된 값이 없습니다.");
        }
        if (animalData6 != null) {
            animalData6.printData();
        } else {
            System.out.println("필드에 대입된 값이 없습니다.");
        }
    }
}
