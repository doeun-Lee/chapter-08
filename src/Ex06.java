class PrimeNumber03 extends Thread implements Runnable{
	public int a;	// �ʵ� ����
	
	public PrimeNumber03(int a, String name) {	// ������ ����
		this.a = a;
		setName(name);
	}
	
	public void run() {	// ���� �Լ�
		int check = 0;
		System.out.println(getName() + ":");	// ������ �̸� ���
		for(int i= 2; i <= a; i++) {	// 20 ������ �� �߿���
			for(int j = 1; j <=i;j++) { // ���� ������ ���� ����� ���Ͽ�
				if (i % j == 0)			// �Ҽ��� �߰��ϸ�
					check++;			// check�� ���� �÷��ش�
			}
			if(check==2){				// check�� ���� 2���
					System.out.print(i+ " "); // ã�Ƴ� �Ҽ��� ����Ѵ�.
			}
			check=0;	// �Ҽ� ��� �� check���� �ٽ� 0���� ������ش�.
		}
		System.out.println();
	}
	
}
public class Ex06 {
	public static void main(String[] args) {
		new Thread(new PrimeNumber03(20,"�Ҽ� ����� ������")).start();
		// ��ü�� ����	
	}
}