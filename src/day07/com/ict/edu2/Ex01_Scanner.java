package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 전체횟수, 짝수횟수, 짝수가 나온 퍼센트 구하기(소숫점 첫째자리까지구하자)

		int total = 0;
		int num = 0;
		int s1 = 0;

		while (true) {
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
				System.out.println("계속할까요?(1.yes, 2.no)>>");
				s1 = scan.nextInt();
				if (s1 == 1) {
					break;
				} else if (s1 == 2) {
					break;
				} else {
					System.out.println("다시입력하세요");
					continue;
				}
			}

			
			// 단점은 2번일때만 멈춤. 그래서 다른 숫자 나올때" 다시 입력하세요">"다시입력하세요 나오기
			if (s1 == 2) {
				break;
			}
		}
		
		int per = 100 * num / total;
			// double per=(even / (count*1.0)*100;
			System.out.println("전체횟수 :" + total);
			System.out.println("짝수횟수 :" + num);
			System.out.println("퍼센트:" + (int) ((per * 10) / 10.0) + "%");

	}
}





/*원하는 데이터 형식으로 화면에 출력하기 위해서는 printf( )문이 주로 사용.
1) printf( ) - 지시자 
%b  : 불리언(boolean) 형식으로 출력 (true or false)
%d  : 10진수(decimal) 형식으로 출력
%o  : 8진수(octal) 형식으로 출력
%x, %X  : 16진수(hexa-decimal) 형식으로 출력 (%x는 소문자로, %X는 대문자로 출력)
%f  : 부동 소수점(floating point) 형식으로 출력
%e, %E  : 지수(exponent) 형식으로 출력
%c  : 문자(character) 형식으로 출력 (Unicode)
%s  : 문자열(string) 형식으로 출력
 

2) printf( ) - 플래그
위 지시자와 함께 아래 플래그를 추가하여 사용하면 더욱 다양한 형식으로 출력할 수 있습니다.

" - "  : 왼쪽으로 정렬
" + "  : 부호출력
" 0 "  : 남는 자리를 0으로 채움
" , "  : 일정 자리수마다 구분문자 표시
" # "  : 8진수, 16진수 표시시 접두사  포함 등 출력형태 보완
 */