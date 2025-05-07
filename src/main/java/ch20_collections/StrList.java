package ch20_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrList {
    public static void main(String[] args) {
        // 비어있는 List 생성 방법
        List<String> strList1 = new ArrayList<>();
        // 배열과의 차이점도 볼 필요가 있습니다.
        String[] strArray1 = new String[2]; // 배열은 인덱스 넘버를 고정시켜야함.
        // 배열에 element를 넣는 방법
        strArray1[0] = "김영";
        // List에 element를 넣는 방법 -> 배열과 달리 method를 통해서 element를 넣어야 함.
        strList1.add("java");
        strList1.add("python");
        strList1.add("C#");
        strList1.add("JavaScript");
        strList1.add("Kotlin");

        // 출력
        System.out.println(strArray1);                      // 참조자료형이라서 주소값이 출력됩니다.
        System.out.println(Arrays.toString(strArray1));     // 배열은 출력하기 위해 static method를 경유해야 함.
        System.out.println(strList1);

        // 특정 element의 포함 여부 -> contains() 메서드를 사용 -> return boolean
        String searchElem1 = "python";      // 하드 코딩을 피하기 위해 변수 대입했습니다.
        boolean contains1 = strList1.contains(searchElem1); // elem이란 표현은 element의 축약어로 자주 쓰임
        System.out.println(searchElem1 + "의 포함 여부 : " + contains1);


    }
}
