package ch19_generic;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date now = new Date();  // Java 내장 클래스로 객체 생성

        ResponseData<String> responseData1 = new ResponseData<>("날짜 저장 성공 : ", now.toString());
        // 근데 <T>에서 T가 클래스이기 때문에 기본자료형이 못들어갑니다. 즉 int는 안되고, Integer는 됨.
        ResponseData<Integer> responseData2 = new ResponseData<>("나이 저장 성공 : ", 38);
        ResponseData<Date> responseData3 = new ResponseData<>("날씨 객체 저장 성공 : ", now);

        System.out.println(responseData1);      // ResponseData 클래스에 @Data가 있으니까 toString()이 있다고 볼 수 있습니다.
        System.out.println(responseData2);
        System.out.println(responseData3);
    }
}
