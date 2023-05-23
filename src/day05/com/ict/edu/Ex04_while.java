package day05.com.ict.edu;

public class Ex04_while {
	public static void main(String[] args) {
		// while문: for문과 같은 반복문
		// 형식1)
		// 초기식;
		// while(조건식){
		// 조건식이 참이면 실행할 문장;
		// 조건식이 참이면 실행할 문장;
		// 증감식;
		// }
		// while 문의 끝을 만나면 조건식으로 간다.

		// 형식2)
		// 초기식;
		// while(true){
		// if(빠져나갈 조건) break; // 조건식이 참이면 실행할 문장;
		// 조건식이 참이면 실행할 문장;
		// 증감식; // }
		// while 문의 끝을 만나면 조건식으로 간다.

		// 1-10까지 출력하자
		int i = 1;
		while (i < 11) {
			System.out.println("i=" + i);
			i++;
		}
		System.out.println("===========================");

		i = 1;
		while (true) {
			if (i >= 11)
				break;
			System.out.println("i=" + i);
			i++;
		}

		System.out.println("=============");

		// 0-10까지 짝수 출력
		i = 0;
		while (i < 11) {
			if (i % 2 == 0) {
				System.out.println("i=" + i);
			}
			i++;
		}
		System.out.println("=============");

		// 구구단7단 출력
		i = 1;
		while (i < 10) {
			System.out.println("7*" + i + "=" + (7 * i));
			i++;
		}

		// 1-10 누적합(합계구하기)
		// sum = 1+2+3+...+10
		int sum = 0;
		i = 1;

		while (i < 11) {
			sum = sum + i;
			i++;
		}

		System.out.println(sum);

		
		
		
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		i = 0;
		while (true) {
			if (i < 4){
				System.out.println(0 + "\t" + 0 + "\t" + 0 + "\t" + 0);
				i++;
			}
			else
				break;
		}
		
		i=1;
		while (i<5) {
			System.out.println("0 0 0 0");
			i++;
			
		}
		for(int s=1;s<5;s++) {
			System.out.println("0 0 0 0");

		}
		
		

		
	}
}
