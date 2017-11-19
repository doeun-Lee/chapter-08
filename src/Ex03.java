class InvalidWithdraw extends RuntimeException{ 
	// ���ο� ���� InvalidWithdraw
   private static final long serialversionUID = 1L; 
   public InvalidWithdraw(String msg) { 
      super(msg); 
   }
}
class BankAccount { 
   int balance = 0; 
   int lowAmount; 
   public BankAccount(int money) { // ��ü ������ �� �Է�
      lowAmount = money; 
   }
   public void deposit(int money) { // �Ա� �޼ҵ�
      balance += money; // ���� �ܾ׿� �Աݾ��� �����ش�
      System.out.printf("���� �Ա�ó�� : �Աݱݾ� = %d, �ܱ� = %d\n", money, balance);
      // �Աݾװ� �Ա� �� �ܾ��� ���
   }
   public void withdraw(int money) throws InvalidWithdraw { // ��� �޼ҵ�
      if( money < 0 ) { // ��ݾ��� �����̸�
         throw new InvalidWithdraw("��û �ݾ��� �����Դϴ�."); // ���� ���
      } 
      if( (balance - money) < lowAmount ) {  // ��ݾ��� ���� �ܾ׺��� ���ٸ�
         throw new InvalidWithdraw("�ʰ���� �䱸 ����"); // ���� ��� 
      } 
      balance -= money;  // �ƴ� ��쿣 �ܾ׿��� ��ݾ��� ���ش�
      System.out.printf("���� ���ó�� : ��ݱݾ� = %d, �ܱ� = %6d\n", money, balance);
      // ��ݾװ� ��� �� �ܾ��� ���
   }
} 
public class Ex03 {
   public static void main(String[] args) { 
	   BankAccount ba = new BankAccount(-100000); // ��ü ����
      try { 
         ba.deposit(100000);  // 100000�� �Ա�
         ba.withdraw(100000); // 100000�� ���
         ba.withdraw(200000); // 200000�� ���
         }  catch(InvalidWithdraw e) {  // ���� �߻���
         e.printStackTrace(); // ���� ���
      }
   }
}