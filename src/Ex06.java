class PrimeNumber03 extends Thread implements Runnable{
	public int a;	// 필드 생성
	
	public PrimeNumber03(int a, String name) {	// 생성자 구현
		this.a = a;
		setName(name);
	}
	
	public void run() {	// 실행 함수
		int check = 0;
		System.out.println(getName() + ":");	// 스레드 이름 출력
		for(int i= 2; i <= a; i++) {	// 20 이하의 수 중에서
			for(int j = 1; j <=i;j++) { // 현재 수보다 작은 수들과 비교하여
				if (i % j == 0)			// 소수를 발견하면
					check++;			// check의 값을 올려준다
			}
			if(check==2){				// check의 값이 2라면
					System.out.print(i+ " "); // 찾아낸 소수를 출력한다.
			}
			check=0;	// 소수 출력 후 check값을 다시 0으로 만들어준다.
		}
		System.out.println();
	}
	
}
public class Ex06 {
	public static void main(String[] args) {
		new Thread(new PrimeNumber03(20,"소수 만드는 스레드")).start();
		// 객체를 생성	
	}
}