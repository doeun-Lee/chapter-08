class InvaliWithdraw extends Exception{ 
   private static final long serialversionUID = 1L; 
   public InvaliWithdraw(String msg) { 
      super(msg); 
   } 
} 
class BankAccount { 
   int balance = 0; 
   int lowAmount; 
   public BankAccount(int money) { 
      lowAmount = money; 
   } 
   public void deposit(int money) { 
      balance += money; 
   } 
   public void withdraw(int money) throws InvaliWithdraw { 
      if( money < 0 ) { 
         throw new InvaliWithdraw("��û �ݾ��� �����Դϴ�."); 
      } 
      if( (balance - money) < lowAmount ) { 
         throw new InvaliWithdraw("���� �ܱ� ���� ��û�Դϴ�."); 
      } 
      balance -= money; 
   }
} 

public class Ex03 { 
   public static void main(String[] args) { 
	   BankAccount ba = new BankAccount(-100000); 
      try { 
         ba.withdraw(5000000); 
         } catch(Exception e) { 
         System.out.println( e ); 
      } 
   }
}
