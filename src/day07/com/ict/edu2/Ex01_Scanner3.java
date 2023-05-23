package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner3 {
	public static void main(String[] args) {
		// 계속할까요(1.yes. 2.no)일 때 Ex01_Scanner2는 숫자로 받았는데
		// 문자로 들어오니 오류발생
		// 그래서 문자로 받아서 처리하자
		
		// Ex01_Scaner의 클래스는 계속할까요? 질문했을 때 2이면 탈출하지만
				// 2를 제외한 나머지는 무조건 다시 실행하게 되는 단점이 있따.
				Scanner scan = new Scanner(System.in);

				// 전체횟수, 짝수횟수, 짝수가 나온 퍼센트 구하기(소숫점 첫째자리까지구하자)

				int total = 0;
				int num = 0;
				int s1 = 0;

				esc: while (true) {
					System.out.print("숫자입력 : ");
					int su = scan.nextInt();
					total++;
					String str = "";
					if (su % 2 == 0) {
						str = "짝수";
						num++;
					} else {
						str = "홀수";
					}
					System.out.println(su + "는" + str + "입니다.");

					while (true) {
						System.out.println("계속할까요?(Y(y)/N(n)) >>");
						String s2 = scan.next();
						if (s2.equalsIgnoreCase("y")) {
							continue esc;
						} else if (s2.equalsIgnoreCase("n")) {
							break esc;
						} else {
							System.out.println("제대로 입력하세요");
							continue;
						}
					}

					// 단점은 2번일때만 멈춤. 그래서 다른 숫자 나올때" 다시 입력하세요">"다시입력하세요 나오기

				}

				int per = 100 * num / total;
				// double per=(even / (count*1.0)*100;
				System.out.println("전체횟수 :" + total);
				System.out.println("짝수횟수 :" + num);
				System.out.println("퍼센트:" + (int) ((per * 10) / 10.0) + "%");

	}
}
