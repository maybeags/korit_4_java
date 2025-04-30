package ch18_static.singleton.products;

public class ProductViewMain {
    public static void main(String[] args) {
//        ProductView productView1 = new ProductView();
//        ProductView productView2 = new ProductView(); // private 선언 후에는 오류 발생합니다.
//        productView1.counter 접근 불가능

        // 생성자를 private 처리를 했고, getInstance() 메서드 내에서 instance 정적 변수가 null이라면
        // instance = new ProductView();하기로 정의했었기 때문에 main 단계에서 저희는
        // ProductView.getInstance();를 통해 객체를 생성합니다.
        ProductView productView1 = ProductView.getInstance();
        ProductView productView2 = ProductView.getInstance();
        ProductView productView3 = ProductView.getInstance();
        ProductView productView4 = ProductView.getInstance();
        /*
            이상의 코드에서 복수의 객체를 생성한 것처럼 보이지만 실제로
            ProductView.getInstance(); 의 결과값은 동일한 instance입니다(확인 필요합니다)
            그렇다면 실제 생성된 객체의 수는 '1개'입니다.
            그리고 그 한개를 다른 객체 이름에 대입했을 뿐입니다.

            그래서 콘솔의 출력결과를 봤을 때,
            1 번 째 객체가 생성되었습니다.
            1 번 째 객체가 생성되었습니다.
            1 번 째 객체가 생성되었습니다.
            1 번 째 객체가 생성되었습니다.

            가 아니라

            1 번 째 객체가 생성되었습니다.
            로 출력된 것으로 증명할 수 있습니다.
         */

        productView1.showMainView();
        productView3.showOrderView();
    }
}
