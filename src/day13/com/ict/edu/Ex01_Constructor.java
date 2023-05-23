package day13.com.ict.edu;

public class Ex01_Constructor {
	// this 와 this()
	//	this : 객체 내부에서 객체 자신을 지칭하는 예약어
	//			지역변수와 전역변수 이름이 같을 때 전역변수 앞에 this 를 붙인다.
	
	//this(): 객체 내부에서 객체 자신의 생성자를 지칭하는 예약어
	
	private String name ="홍길동";
	private int age = 34;
	

	
	
	public Ex01_Constructor() {
		//생성자가 다른 생성자 호출(반드시 첫번쨰 줄에서)
		// 기본생성자 ctrl  + space 바 누르면 나옴
		this("임꺽정");
		System.out.println("기본생성자 : " + this );
		// 생성자에서 메서드를 호출
		prn();
		this.prn();
	}
	
	//생성자 오버로딩(같은이름의 생성자가 2개 이상 있음)
	public Ex01_Constructor(String name) {
		this.name=name;
	}
	//생성자로 데이터를 바꿀 때, 객체 만들때 딱 한번만 호출된다 
	
	
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void prn() {
		
	}
	
	
	// 지역변수는 보통 메서드 안에 있다
	//지역변수는 보통 호출을 해야 만들어짐
	//지금 메인 입장에서는 지역변수가 안보임
	//한번 호출해야 보이니까
	//
	
}
