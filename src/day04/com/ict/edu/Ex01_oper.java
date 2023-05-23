package day04.com.ict.edu;

public class Ex01_oper {
	public static void main(String[] args) {
		// 삼항 연산자 : 조건식 => 조건이 참 일때와 거짓일 때 구분해서 실행한다.
		// 형식) 자료형 변수이름 = (조건식) ? 조건식이 참일때 실행할 문장 : 조건식이 거짓일 떄 실행할 문장; =>분기
		// 주의사항**) 변수, 참일때 실행 결과, 거짓일때 실행 결과 모두 같은자료형이여야한다.
		// 조건식에는 boolean(true,false), 비교연산자(>,< ..), 논리연산자(&&, ||, !)

		String str = (false) ? "강아지" : "고양이";
		System.out.println("결과:" + str);

		// int avg=80;
		double avg = 85.3; // 실수와 정수는 비교 가능(단지 숫자만 비교하는거라서)
		str = (avg >= 60) ? "합격" : "불합격";
		System.out.println(str);

		char c1 = 'G';
		str = (c1 >= 'a' && c1 <= 'z') ? "소문자" : "소문자아님";
		System.out.println(str);

		// 1 또는 3이면 남자,아니면 여자
		int gender = 1;
		str = (gender == 1 || gender == 3) ? "남자" : "여자";
		System.out.println(str);

		// 홀수이면 남자, 짝수이면 여자
		gender = 4;
		str = (gender % 2 == 1) ? "남자" : "여자";
		System.out.println(str);

		// 3의 배수인지 아닌지 알아보자
		int su1 = 157;
		// 3으로 나누어서 나머지가 0
		str = (su1 % 3 == 0) ? "3의배수" : "아니다";
		System.out.println(str);

		// 근무시간이 8시간까지는 시간당 9620이고
		// 8시간을 초과한 시간만큼은 1.5배 지급한다
		// 현재 근무한시간이 10이다.
		// 얼마를 받아야하는가

		// int pay,time,over,sum;
		// pay=9620 ; // 시급
		// time=10; // 시간
		// over=(time-8); // 초과시간
		// sum = (time > 8) ? ((pay*8)+(int)(pay*over*1.5)) : (pay*time);
		// System.out.println("받아야할 돈 : " +sum);

		// 근무시간이 8시간까지는 시간당 9620이고
		// 8시간을 초과한 시간만큼은 1.5배 지급한다
		// 현재 근무한시간이 10이다.
		// 얼마를 받아야하는가

		int num1 = 47;
		int num2 = 32;
		int res = (num1 > num2) ? num1 : num2;
		System.out.println(res);

		res = (num1 - num2 > 0) ? num1 : num2;
		System.out.println(res);

		int res2 = Math.max(num1, num2);
		System.out.println(res2);

		int res3 = 38;
		int res4 = (res3 > 0) ? res3 : res3 * -1;
		System.out.println(res4);
		
		int res5= Math.abs(res3);
		System.out.println(res5);		
		
	
	}
}
