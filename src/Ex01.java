import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int x=0, y=0, z=0;
		Scanner input = new Scanner(System.in);		
		try {
		System.out.println("���� �� �� �Է�: ");			// �ΰ��� ������ �Է¹޴´�.
		x=input.nextInt();							// x �Է�
		y=input.nextInt();							// y �Է�
		z=x*y;										// �Է¹��� �� ���� ����
		System.out.printf("%d * %d = %d\n", x, y, z);
		} catch(Exception e) {						// ���� �߻���
			System.out.println("���� �߻�: " + e);		// ���� ���	
		} finally {									// ���� ó���� ������� �����
			System.out.println("���α׷��� ���������� ����˴ϴ�.");
		}
	}

}