package day04.com.ict.edu;

public class Ex05_multi_if {
	public static void main(String[] args) {
		// 다중 if 문
		// 형식) if(조건식1){
		// 조건식1이 참일때 실행할 문장;
		// 조건식1이 참일때 실행할 문장;
		// }else if(조건식2){
		// 조건식1은 거짓이면서 조건식2가 참일때 실행할 문장;
		// 조건식1은 거짓이면서 조건식2가 참일때 실행할 문장;
		// }else if(조건식3){
		// 조건식1,2는 거짓이면서 조건식3이 참일때 실행할 문장;
		// 조건식1,2는 거짓이면서 조건식3이 참일때 실행할 문장;
		// }else{
		// 조건1,2,3 모두 거짓인경우
		// }

		// int k1의 점수가 90이상이면 A학점, 80이상이면 B학점, 70이상이면 C학점, 나머지 F 학점

		int k1 = 67;
		String str = "";
		if (k1 >= 90) {
			str = "A학점";
		} else if (k1 >= 80 && k1 < 90) {
			str = "B학점";
		} else if (k1 >= 70 && k1 < 80) {
			str = "C학점";
		} else {
			str = "F";
		}
		System.out.println(str);

		// char k2가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별하자
		char k2 = 'h';
		if (k2 >= 'A' && k2 <= 'Z') {
			str = "대문자";
		} else if (k2 >= 'a' && k2 <= 'z') {
			str = "소문자";
		} else if (k2 >= '0' && k2 <= '9') {
			str = "숫자";
		} else {
			str = "기타문자";
		}
		System.out.println(str);

		// char k3이 A,a이면 아프리카, B,b이면 브라질, C,c이면 캐나다, 나머지는 한국
		char k3 = 'b';
		if (k3 == 'A' || k3 == 'a') {
			str = "아프리카";
		} else if (k3 == 'B' || k3 == 'b') {
			str = "브라질";
		} else if (k3 == 'C' || k3 == 'C') {
			str = "캐나다";
		} else {
			str = "한국";
		}
		System.out.println(str);

		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
		// 4이면 과일쥬스 3500이다. 친구와 2잔을 10000내고 먹었다.
		// 잔돈은 얼마인가?(부가세 10%별도), 친구와 같은 음료만 선택 가능

	
		int menu = 0;
		int cash = 10000;
		int price = 0;
		int total = 0;
		int ling = 0;

		if (menu == 1) {
			price = 3500;
		} else if (menu == 2) {
			price = 4000;
		} else if (menu == 3) {
			price = 3000;
		} else if (menu == 4) {
			price = 3500;
		}

		total = (int)((price*2)*1.1);
		ling= cash-total;
		System.out.println(ling);
		
		
		
		//선생님 풀이
		int men = 3;
		int in =10000;
		int su =2;//사람수
		int dan =0;
		String drink ="";
		
		
		if (men == 1) {
			drink ="카페모카";
			dan=3500;
		} else if (men == 2) {
			drink ="카페라떼";
			dan=4000;
		} else if (men== 3) {
			drink ="아메리카노";
			dan=3000;
		} else if (men == 4) {
			drink ="과일쥬스";
			dan=3500;
		}

		int totall=dan*su;
		int vat =(int)(total*0.1);
		int out=in-(total+vat);
		System.out.println("선택메뉴 : "+ drink);
		System.out.println("잔돈:"+out);
		
		


	}
}
