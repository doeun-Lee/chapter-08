class InvalidWithdraw extends RuntimeException{ 
	// 새로운 예외 InvalidWithdraw
   private static final long serialversionUID = 1L; 
   public InvalidWithdraw(String msg) { 
      super(msg); 
   }
}
class BankAccount { 
   int balance = 0; 
   int lowAmount; 
   public BankAccount(int money) { // 객체 생성시 돈 입력
      lowAmount = money; 
   }
   public void deposit(int money) { // 입금 메소드
      balance += money; // 현재 잔액에 입금액을 더해준다
      System.out.printf("정상 입금처리 : 입금금액 = %d, 잔금 = %d\n", money, balance);
      // 입금액과 입금 후 잔액을 출력
   }
   public void withdraw(int money) throws InvalidWithdraw { // 출금 메소드
      if( money < 0 ) { // 출금액이 음수이면
         throw new InvalidWithdraw("요청 금액이 음수입니다."); // 에러 출력
      } 
      if( (balance - money) < lowAmount ) {  // 출금액이 현재 잔액보다 적다면
         throw new InvalidWithdraw("초과출금 요구 예약"); // 에러 출력 
      } 
      balance -= money;  // 아닐 경우엔 잔액에서 출금액을 빼준다
      System.out.printf("정상 출금처리 : 출금금액 = %d, 잔금 = %6d\n", money, balance);
      // 출금액과 출금 후 잔액을 출력
   }
} 
public class Ex03 {
   public static void main(String[] args) { 
	   BankAccount ba = new BankAccount(-100000); // 객체 생성
      try { 
         ba.deposit(100000);  // 100000원 입금
         ba.withdraw(100000); // 100000원 출금
         ba.withdraw(200000); // 200000원 출금
         }  catch(InvalidWithdraw e) {  // 오류 발생시
         e.printStackTrace(); // 오류 출력
      }
   }
}