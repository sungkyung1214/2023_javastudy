package day04.com.ict.edu;

public class Ex03_if {
	public static void main(String[] args) {
		// 단순 if문 : 조건식이 참일때만 실행, 거짓이면 if문 무시
		// 형식)if(조건식){
		// 조건식이 참일때 실행할 문장;
		// 조건식이 참일때 실행할 문장;
		// }
		// 단, 실행문장이 한줄이면 {} 블록을 생략할 수 있다.

		// 형식)if(조건식) 조건식이 참일때 실행할 문자;

		// int k1 이 60 이상이면 합격
		int k1 = 55;
		String res = "초기값";// 기본적으로는 초기값을 넣기(오류방지를 위해)
		if (k1 >= 60) {
			res = "합격";
		}

		if (k1 < 60)
			res = "불합격";
		System.out.println(res);

		// int k2가 홀수인인지 짝수인지 판별하자
		int k2 = 43;
		res = "짝수";
		if (k2 % 2 == 1) {
			res = "홀수";
		}
		System.out.println(res);

		// char k3 가 대문자인지, 아닌지 판별하자
		char k3 = 'T';
		res = "대문자아님";
		if (k3>='A' && k3<='Z') {
			res="대문자";
		}
		System.out.println(res);
	
		// 근무시간이 8시간까지는 시간당 9620이고
		// 8시간을 초과한 시간만큼은 1.5배 지급한다
		// 현재 근무한시간이 10이다.
		// 얼마를 받아야하는가

		
		//내가 풀어본것
		//int res2= 0;
		//int all=10;
		//int work= 8;
		//int to=9620*(int)1.5;
		//int money=9620*8;
		//int ot=all-work;
		//if (all>=8) {
		//res2	= money+ot*to;
		//}
	    //System.out.println(res2);
	    
		//선생님풀이
		int time=10;
		int limt =8;
		int dan=9620;
		int pay =time*dan;
		if (time>limt) {
		pay=(limt*dan)+(int)((time-limt)*dan*1.5);	
		}
		System.out.println(pay);
		
		
		
	
	}
}







