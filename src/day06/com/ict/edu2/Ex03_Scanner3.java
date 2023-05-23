package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex03_Scanner3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 근무시간이 8시간까지는 시간단9620
		// 8시간을 초과한 시간만큼은 1.5배 지급한다
		// 현재 근무한 시간이 10이다.
		// 얼마를 받아야하는가?
		System.out.print("근무시간 : ");
		int time = scan.nextInt();
		int money = 0;
		int hour = 9620;
		int get = 0;

		if (time <= 8) {
			get = time * hour;
		} else {
			get = (hour * 8) + ((time - 8) * (int) (9620 * 1.5));
		}
		System.out.println("받을금액은" + get + "입니다.");

		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
		// 3이면 아메리카노 3000, 4이면 과일 쥬스 3500이다.
		// 친구와 함께 2잔을 10000 내고 먹었다.
		// 선택한 메뉴와 잔돈을 출력하자 (단, 부가세 10%는 포함)
		// (친구와 같은 음료을 먹어야 한다.)
		System.out.print("메뉴선택 \n1.카페모카(3500)\n2.카페라떼(4000)" + "\n3.아메리카노(3000)\n4.과일쥬스(3500)\n>>>>>>>>>  ");
		int menu = scan.nextInt();
		int dan = 0;
		String drink = "";
		int total = 0;
		int vat = 0;
		int in = 10000;
		int out = 0;
		int su = 2;

		if (menu == 1) {
			dan = 3500;
			drink = "카페모카";
		} else if (menu == 2) {
			dan = 4000;
			drink = "카페라떼";
		} else if (menu == 3) {
			dan = 3000;
			drink = "아메리카노";
		} else if (menu == 4) {
			dan = 3500;
			drink = "과일쥬스";
		}
		total = dan * su;
		vat = (int) (total * 0.1);
		
		out= in-(total+vat);
		System.out.println("잔돈:"+out);

		// 나라를 입력하면 수도가 출력되게하자
		// 한국서울 중국베이징 일본도쿄 미국워싱턴 이외에는 데이터 없음
		// switch~case
		System.out.print("나라 입력:");
		String country = scan.next();
		String str = "";
		switch (country) {
		case "한국": str="서울"; break;
		case "중국": str="베이징"; break;
		case "일본": str="도쿄"; break;
		case "미국": str="워싱턴"; break;
		default: str= "데이터없음";
		}
		System.out.println(country+"의 수도는"+ str +"입니다");

	}
}
