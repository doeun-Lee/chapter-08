import java.util.Date;		// ��¥�� �ð��� �����ϴ� Ŭ����
	class PrintTime implements Runnable{
	Date now = new Date();
		public int num;		 // num �ʵ� ����
		public String name;  // name �ʵ� ����
		public int priority; // priority �ʵ� ����
		
		public PrintTime(int num) {	 // ������ ����
			this.num=num;
		}
				
		public void run() {		// �����Լ�
			for(int i=1; i<=num; i++) {	// ������ Ƚ����ŭ �ݺ�
				System.out.printf("���� : %d  ", Thread.currentThread().getPriority());
				// �������� �켱���� ���
				System.out.print(now);	// ���� �ð� �� ��¥ ���
				System.out.println("  " + Thread.currentThread().getName());
				// �������� �̸� ���
			}
		}
}

public class Ex07 {
	public static void main(String[] args) {
		PrintTime p1 = new PrintTime(3);		// PrimeTime ������ ����
		Thread th1 = new Thread(p1, "�ȳ��ϼ���!");	// ������ �̸��� Ƚ�� ����
		th1.setPriority(Thread.MAX_PRIORITY-1);	// �������� �켱���� ����
		th1.start();							// ���

		PrintTime p2 = new PrintTime(6);		 // PrimeTime �ι�° ������ ����
		Thread th2 = new Thread(p2, "�ݰ����ϴ�");	 // ������ �̸��� Ƚ�� ����
		th2.setPriority(Thread.NORM_PRIORITY-1); // �������� �켱���� ���� 
		th2.start();							 // ���
	}
}