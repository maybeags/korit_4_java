package ch11_access_modifier;

public class BankMain {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        bank1.setAccountNum(987654);
        bank1.setAccountHolder("김일");
        bank1.setBalance(-100);                 // 제대로 setBalance()를 작성한거 확인
        System.out.println(bank1.getBalance());// 콘솔창에서 확인하기 위한 getBalance();
        bank1.setBalance(100000);
        bank1.setPinNumber(9876);

        bank1.displayInfo();

        // 비밀번호 틀린 실패 사례 검증용 테스트 코드
        bank1.deposit(10000, 1234);
        // 비밀번호는 맞지만 계좌 입금 금액이 틀린 테스트 코드
        bank1.deposit(-10, 9876);
        // 성공 사례 테스트 코드
        bank1.deposit(10000, 9876);

        // withdraw 검증
        // 비밀번호 x
        bank1.withdraw(20000, 1234);
        // 출금 금액 실패
        bank1.withdraw(-20, 9876);
        // 잔액보다 많이 출금해서 실패 사례
        bank1.withdraw(4000000, 9876);
        // 성공 사례
        bank1.withdraw(50000, 9876);

        bank1.displayInfo();
    }
}
