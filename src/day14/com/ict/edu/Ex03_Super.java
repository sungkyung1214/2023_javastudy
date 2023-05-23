package day14.com.ict.edu;

public class Ex03_Super {
	String name= "홍길동";
	int age = 57;
	String addr = "서울 방학동";
	
	private String dog = "댕댕이";
	String car = "제네시스" ;
	
	//스테틱은 다 갖다 쓸 수 있지만, private이 붙으면 갖다쓸수 없음
	static String playstation = "5버전";
	
	public Ex03_Super() {
		System.out.println("부모클래스 생성자 : " + this);//생성자에서 자기 자신을 뜻하는것은 this

	}
}
