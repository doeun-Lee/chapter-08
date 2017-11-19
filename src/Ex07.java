import java.util.Date;		// 날짜와 시간을 제공하는 클래스
	class PrintTime implements Runnable{
	Date now = new Date();
		public int num;		 // num 필드 생성
		public String name;  // name 필드 생성
		public int priority; // priority 필드 생성
		
		public PrintTime(int num) {	 // 생성자 구현
			this.num=num;
		}
				
		public void run() {		// 실행함수
			for(int i=1; i<=num; i++) {	// 지정된 횟수만큼 반복
				System.out.printf("순위 : %d  ", Thread.currentThread().getPriority());
				// 스레드의 우선순위 출력
				System.out.print(now);	// 현재 시간 및 날짜 출력
				System.out.println("  " + Thread.currentThread().getName());
				// 스레드의 이름 출력
			}
		}
}

public class Ex07 {
	public static void main(String[] args) {
		PrintTime p1 = new PrintTime(3);		// PrimeTime 생성자 구현
		Thread th1 = new Thread(p1, "안녕하세요!");	// 스레드 이름과 횟수 구현
		th1.setPriority(Thread.MAX_PRIORITY-1);	// 스레드의 우선순위 지정
		th1.start();							// 출력

		PrintTime p2 = new PrintTime(6);		 // PrimeTime 두번째 생성자 구현
		Thread th2 = new Thread(p2, "반갑습니다");	 // 스레드 이름과 횟수 구현
		th2.setPriority(Thread.NORM_PRIORITY-1); // 스레드의 우선순위 지정 
		th2.start();							 // 출력
	}
}