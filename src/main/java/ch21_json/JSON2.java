package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}


public class JSON2 {
    public static void main(String[] args) {
        // 사용할 객체 생성
        Gson gson = new Gson();     // 아까랑 다르게 그냥 Gson 인스턴스를 만들었습니다.
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        // 아까와 동일하게 gsonBuilder를 통해서 prettyPrinting이 적용될 수 있도록 인스턴스를 생성

        // 사용할 변수 선언
        String userJson = null;

        // 1. Java Object -> json으로 변환
        // user1 객체를 생성하고 "kim1", "9876", "a@test.com", "김일", "20"로 입력하시오.
        // 1-1. 위에 클래스 정의했으니까 setter 정의해서 집어넣는 방법이 있겠습니다.
        // 1-2. setter 정의하려고 보니까 @Setter를 쓰면 되겠다 하면 이게 두 번째 방법
        // 1-3. 근데 생성하면서 동시에 속성값 넣고 싶으면 @AllArgsConstructor를 사용해도 되겠네요.
        User user1 = new User("kim1", "9876", "a@test.com", "김일", "20");
        // 그럼 생성된 user1 인스턴스를 가지고 Json 데이터로 바꿀겁니다.
        userJson = gson.toJson(user1);
        System.out.println("gson 사용 결과값 : " + userJson);
        userJson = gsonBuilder.toJson(user1);
        System.out.println("gsonBuilder 사용 결과값 : " + userJson);

        // 2. JsonObject -> json으로 변환 근데 저희가 JSON1에서 했던겁니다.
        // JSonObject를 활용하여 studentCode 2025001 / studentName 김이 / studentYear 2 / score 96.7인 객체를 생성하시오.
        // 참고로 key value 다 String으로 잡아놓겠습니다.
        // JsonObject 클래스의 인스턴스 생성
        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("studentCode", "2025001");
        jsonObject1.addProperty("studentName", "김이");
        jsonObject1.addProperty("studentYear", "2");
        jsonObject1.addProperty("score", "96.7");

        String studentJson = gson.toJson(jsonObject1);
        System.out.println(studentJson);
        // gson 및 gsonBuilder를 이용하여 studentJson을 두 번 출력한 결과값을 콘솔창에 띄울 수 있도록 하시오.
        studentJson = gsonBuilder.toJson(jsonObject1);
        System.out.println(studentJson);

        // 3. Map -> Json 데이터로
        /*
            Map을 활용하여 key String / value String으로 선언하고, 객체명을 map1으로 한
            빈 map을 생성하시오.

            map에 productCode NT960XHA-KD72G
            productName 삼성 갤럭시북 프로 5
            라는 Entry(key-value pair)를 입력하시오.

            gson 및 gsonBuilder를 활용하여 json 데이터로 바꿀겁니다(근데 얘가 좀 달라서 같이하겠습니다)
         */
        Map<String, String> map1 = new HashMap<>();
        map1.put("productCode", "NT960XHA-KD72G");
        map1.put("productName", "삼성 갤럭시북 프로 5");

        System.out.println("gson 사용 사례 : " + gson.toJson(map1));
        System.out.println("gsonBuilder 사용 사례 : " + gsonBuilder.toJson(map1));
        String productJson = gsonBuilder.toJson(map1);      // 하는 김에 Json 데이터들의 자료형이 전부 String인 것에 주목해야합니다.

        // 그렇다면 json -> Map / Java 객체 자료형으로 바꾸려면 어떡해야 할까요.
        // 즉 json 데이터를 user 객체로 다시 바꾸는 것과
        // json 데이터를 map2 형태로 작성하는 것을 의미합니다.
        // 형식 :
        // gson.fromJson(제이슨데이터, 바꾸고자하는_클래스명.class);

        // json -> map
        Map<String, String> map2 = gson.fromJson(productJson, Map.class);   // gsonBuilder.toJson(map1)이든 gson.toJson(map1)이든 상관없습니다.
        System.out.println(map2);
        // json -> User 클래스의 인스턴스로 바꾸는 방법








    }
}
