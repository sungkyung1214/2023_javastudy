package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		// Scanner 클래스 : 키보드에 입력된 정보를 받아서 처리하는 클래스
		// System.out => 표준 출력장치(모니터)
        //System.in => 표준 입력장치(키보드)
		// 회사에서 제공하는 클래스(api)를 사용하기 위해서 import를 해야된다.
		
		//java.lang 패키지안에 존재하는 클래스는 아무런 제약없이 사용가능(import안함)
		//java.lang 패키지 외에 존재하는 클래스는 무조건 import해야 된다.
		
		//impport 방법) 1. 클래스이름 뒤에서  ctrl + space
		//			   2. ctrl +shift + O
		
		// 해당 클래스 커서를 뒤에 놓고 shift + f2 => 해당 클래스 api 설명서가 나타난다.
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("이름: ");
		//.next():입력한 내용을  String으로 처리하는 메서드
		String name= scan.next();
		System.out.println("받은내용:"+ name);

		
		System.out.print("나이: ");
		//.next():입력한 내용을  String으로 처리하는 메서드
		String age= scan.next();
		System.out.println("받은내용:"+ (age+1));
	
		System.out.print("나이: ");
		//.nextInt():입력한 내용을  int로 처리하는 메서드 (문자를 입력하면 오류)
		int age2= scan.nextInt();
		System.out.println("받은내용:"+ (age2+1));
	
		System.out.print("키: ");
		//.nextDouble() : 입력한 내용을 double로 처리는 메서드(문자를 입력하면 오류)
		double ke = scan.nextDouble();
		System.out.println("받은내용:" + ke);
		
		System.out.print("당신은 남성입니까?(true/false)");
		//.nextboolean() : 입력한 내용을 boolean으로 처리하는 메서드
		boolean gender = scan.nextBoolean();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//next메소드 와 nextline의 차이
	
	
	
	
	}
}
