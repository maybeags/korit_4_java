package ch15_casting.control;

public class Main {
    public static void main(String[] args) {
        // 객체들 생성
        Computer computer1 = new Computer();
        LED led1 = new LED();
        Mouse mouse1 = new Mouse();
        CentralControl control1 = new CentralControl(new Power[5]);
        // 배열 생성 방법을 떠올려서 5개짜리 사이즈의 배열을 CentralControl() 생성자의
        // argument로 집어넣어보세요.
        // int[] arr01 = new int[3];
        // int[] arr02 = { 1, 2, 3, 4, 5 };
        Power[] powers = {computer1, led1, mouse1};
        CentralControl control2 = new CentralControl(powers);
        // 빈 배열을 집어넣는 것만 가능한게 아니라, 미리 배열을 생성해놓고(근데 14번 라인을
        // 확인했을 때 이미 암시적 업캐스팅이 이루어졌습니다), 그 배열을
        // control2 생성시에 집어넣는 방법이 가능합니다.
        // 다만 이상의 경우 구글홈미니를 만들어놨는데 거기에 default로
        // 컴퓨터, LED, 마우스가 한대씩 등록되어있다고 봐야하기 때문에 저희는
        // 9번 라인에 작성한 control1을 기준으로 수업합니다.

        control1.addDevice(computer1);      // 여기서 0번 인덱스를 차지했기 때문에
        control1.addDevice(led1);
        control1.addDevice(mouse1);
        // 배열 내부에 들어갈 수 없는 예시 하나 생성 하겠습니다
//        String name = "안근수";
//        control1.addDevice(name);
        // 이상이 오류가 발생한다는 점은 control1내에 들어가있기만하면 걔는 Power의 서브 클래스의 객체라는 점
        control1.powerOn();
        control1.powerOff();



        // System.out.println(control1.checkEmpty());  // 결과값 : 1 -> 확인하고 checkEmpty()를 private처리했습니다.


        // Smartphone, Speaker, Tv 객체를 각각 만들어서 순서대로 control1 객체의 필드인
        // deviceArray에 집어넣으시오.

        // deviceArray에 연결된 제품들의 전원을 켜도록 코드를 작성하시오.
        // tv1의 전원을 켜도록 코드를 작성하시오.

        // deviceArray에 연결된 제품들의 전원을 끄도록 코드를 작성하시오.
        // tv1의 전원을 끄도록 코드를 작성하시오.

        SmartPhone smartPhone1 = new SmartPhone();
        Speaker speaker1 = new Speaker();
        Tv tv1 = new Tv();

        control1.addDevice(smartPhone1);
        control1.addDevice(speaker1);
        control1.addDevice(tv1);
        control1.powerOn();
        tv1.on();

        control1.powerOff();
        tv1.off();

        control1.performSpecificMethod();
        // tv1의 경우 control의 필드에 들어가 있지 않기 때문에
        tv1.channelUp();
    }
}
