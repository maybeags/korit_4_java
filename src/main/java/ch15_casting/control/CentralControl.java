package ch15_casting.control;
// LED 클래스 / Mouse 클래스를 생성하고 적절하게
// 메서드의 구현부를 완성하시오.
public class CentralControl {
    // 필드 선언
    private Power[] deviceArray;
    // 매개변수 생성자를 작성하시오.

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    // Main에서 확인결과 곧장 element가 있는 배열을 집어넣지 못했으니까
    // Power의 자식 클래스의 인스턴스들을 집어넣는 메서드를 정의

    public void addDevice(Power device) {
        // 왜 매개변수의 자료형이 Power인지도 고민이 필요합니다.
        // Computer / LED / Mouse에 해당하는 객체들을 신경쓰지 않고 넣기 위해
        // -> 어차피 암시적으로 업캐스팅 되니까
        int emptyIndex = checkEmpty();  // 아직 정의 안했습니다.
        // 명확한 설계 하에 작성하게 된다면 이런 일이 안벌어지겠지만
        // 매우 자주 일어나는 상황이라서 남겨놓겠습니다.
        if (emptyIndex == -1) {                     // checkEmpty() 메서드의 결과값이 -1이라면
                                                    // 배열이 비어있지 않다는 의미였습니다.
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;                                 // 메서드 종료 키워드
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 연결되었습니다.");
        /*
            객체명.getClass() -> 패키지 명을 포함한 클래스명이 반환됨(@주소지가 날라감)
            객체명.getClass().getSimpleName() -> 패키지 명도 날라가고 클래스명만 반환됨
            특히 32번 라인의 경우 메서드 체이닝이라는 표현으로 자주 쓰입니다.
         */
    }

  private int checkEmpty() { // 비어있는 배열의 index number를 반환하기 위한 method
        // 배열을 반복문을 돌려가지고 null값 빠져나오는 애를 return 하면 되겠죠.
        // 이상의 경우 굳이 정신나간 방법으로 코딩하지 않는 이상 가장 빨리 만나게 되는 null의
        // index number가 반환될겁니다.
        for (int i = 0 ; i < deviceArray.length ; i++) {
            if(deviceArray[i] == null) {
                return i;
            }
        }
        // 근데 안 비어있는 경우도 있겠죠.
        return -1;
        /*
            Java에서 index 넘버에는 음수값이 없기 때문에(근데 python에는 마이너스인덱스가 있습니다),
            실패를 나타낼 때 -1을 쓰는 경우가 많습니다.
            근데 0과 너무 가까운 수다보니까 -100을 먹인다든지 혹은 return 값으로 나올 수 없을만한
            음수를 지정하는 경우도 있는데,
            나중에 addDevice()메서드에 if(checkEmpty() == -128947)로 쓰고 싶지 않다면
            -1을 쓰는게 정신건강에 좋습니다.
         */
    }

    public void powerOn() {
        // deviceArray 배열 내에 있는 각 element들은 Power 서브 클래스의 인스턴스에 해당
        // 그러면 .on() / .off()를 전부 다 가지고 있을 거고, instanceof를 쓸 필요 x
        for ( Power device : deviceArray ) {
            if (device == null) {
                System.out.println("장치가 등록되지 않은 슬롯입니다.");
                continue;       // 메서드를 종료하는게 아니라 다음 반복으로 넘어가는 키워드
            }
            device.on();
        }
    }

    public void powerOff() {
        // 일반 for문으로 각 배열을 돌면서 .off() 시켜주세요.
        // main에서 호출하시면 됩니다. null인 경우에는 "장치가 등록되지 않은 슬롯입니다." 출력
        for ( int i = 0 ; i < deviceArray.length ; i++ ) {
            if(deviceArray[i] == null) {
                System.out.println("장치가 등록되지 않은 슬롯입니다.");
                continue;
            }
            deviceArray[i].off();
        }
    }





}
