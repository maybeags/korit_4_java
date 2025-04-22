package ch03_operator;
/*
    camel case -> Java 변수 표기법
    snake case -> Java에서는 쓸 일이 잘 없음
    Pascal case -> 첫 문자가 대문자고 나머지 소문자로 가다가
        두 번째 단어의 첫 번째 문자는 또 대문자로 작성
        ex) 한 단어 짜리 : Operator01
        ex) 복수 단어 : OperatorTest

 */
public class Operator01 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
//        int i = 10;

        // 여기서 자료형, 변수명, 데이터에 대해서는 학습했습니다.
        // '=' 얘를 배울겁니다.
        /*
            대입 연산자 = : = 오른쪽에 있는 데이터를 = 왼쪽에 있는
                변수에 '대입한다는 의미'로, 변수와 데이터가 동일하다는
                수학적인 의미가 아닙니다.
         */
//        int i2 = 20;
//        i2 = i2 + 30; // 왼쪽과 오른쪽이 같다고 표시할 때는 ==

        // 일반 연산자
        /*
            + : 더하기
            - : 빼기
            * : 곱하기
            / : 나누기
            % : 나머지 연산자
         */
//        int a = 5;
//        int b = 2;
//        double result = (double) a / b;
//        System.out.println(result);
//        System.out.println(a%b);

        /*
            복합 대입 연산자
            1) +=
            2) -=
            3) *=
            4) /=
         */
//        int num1 = 1;
//        System.out.println(num1);
//        num1 += 2;                      // num1 = num1 + 2;
//        System.out.println(num1);
//        num1 -= 1;                      // num1 = num1 - 1;
//        System.out.println(num1);
//        num1 *= 10;                     // num1 = num1 * 10;
//        System.out.println(num1);
//        num1 /= 5;                      // num1 = num1 / 5;
//        System.out.println(num1);

//        int j = 10;
//        System.out.println(j);
//        System.out.println(j++);    // 변수명++ : 코드를 실행시킨 후에 j에 1을 더함
//        System.out.println(j);      // 그래서 다시 j를 출력시켰을 때 여기가 11
//        System.out.println(++j);    // ++변수명 : 코드를 실행시키기 전에 j에 1을 더함 - 12
//        System.out.println(j);      // 결과값은 12
//        System.out.println(j--);    // 변수명-- : 코드를 실행시킨 후에 j에 1을 뺌.
//        System.out.println(j);
//        System.out.println(--j);    // --변수명 : 코드를 실행시키기 전에 j에 1을 뺌 - 10

        int age = 10;
        System.out.println("제 나이는 " + age + "살입니다.");
        System.out.println("내년에는 " + (age + 1) + "살이 됩니다.");
        // Operator02 를 생성하고 -> main 메서드를 적용하세요
    }
}
