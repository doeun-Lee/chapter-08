import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int x=0, y=0, z=0;
		Scanner input = new Scanner(System.in);		
		try {
		System.out.println("정수 두 개 입력: ");			// 두개의 정수를 입력받는다.
		x=input.nextInt();							// x 입력
		y=input.nextInt();							// y 입력
		z=x*y;										// 입력받은 두 수의 곱셈
		System.out.printf("%d * %d = %d\n", x, y, z);
		} catch(Exception e) {						// 예외 발생시
			System.out.println("예외 발생: " + e);		// 예외 출력	
		} finally {									// 예외 처리와 상관없이 실행됨
			System.out.println("프로그램이 정상적으로 종료됩니다.");
		}
	}

}