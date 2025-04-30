package ch18_static;

import ch08_methods.Method01;

import java.util.Arrays;

public class ProductMain {
    public static void main(String[] args) {
        Method01.call1();       // 근데 다른 클래스에서 사용하려면 클래스명.메서드명();으로 호출
//        System.out.println(Arrays.toString());    // 이상의 방식의 호출을 이미 사용했습니다.

        System.out.println(Product.getCount());  // 클래스명.메서드명()을 통한 getter
        Product product1 = new Product();
        System.out.println("count : " + Product.getCount());
        System.out.println("instanceCount : " + product1.getInstanceCount());
        Product product2 = new Product();
        System.out.println("count : " + Product.getCount());
        System.out.println("instanceCount : " + product2.getInstanceCount());
    }
}
