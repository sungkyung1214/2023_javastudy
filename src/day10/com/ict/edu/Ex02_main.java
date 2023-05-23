package day10.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		// static ; 객체 생성없이 클래스 이름.변수이름
		System.out.println(Ex02_class.AVG);
		System.out.println(Ex02_class.sum);
	
		// instance는 객체 생성 후 접근
		// 객체생성)
		// 클래스이름 참조변수 = new 생성자([]);
		// ** 해당 클래스의 생성자가 없으면 기본생성자 사용
		// ** 기본 생성자란 인자가 없는 생성자, 클래스이름() = 기본생성자()
		Ex02_class test = new Ex02_class();
		// 접근법 ; 참조변수.멤버피드
		System.out.println(test.name);
		System.out.println(test.GENDER);
		System.out.println(test);
		System.out.println(test.AVG);
		System.out.println(test.sum);     
		
		//변수와 상수의 차이
		test.name = "일지매";
		
		
		Ex02_class.sum =1000;
	
		
	
		/*다른자료면서 변수이름으로 접근하는게 클래스
		변수이름으로 접근하는게 클래스
		
		변수는 한개 기억 
		그래서 배열 만듬 여러개 한꺼번에 기억 
		근데 같은 자료형이야 가능 
		불를라면 방번호 불러야함
		but!!!클래스는 이름으로 불러재낌
		저장측면엔느 클래스가 쩨일~~~~*/
		
		
		
		
		
	}
}
