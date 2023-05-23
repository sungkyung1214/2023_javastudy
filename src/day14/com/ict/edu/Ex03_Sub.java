package day14.com.ict.edu;

//자식클래스에서 부모클래스를 선택해서 상속관계를 맺는다.
//상속관계 : 자식 클래스가 부모클래스의 멤버필드와 멤버메서드를 
//		   마음대로 사용할 수 있는 클래스 관계
//	형식 : class 자식클래스 extends 부모클래스
//	특징 : 모든 클래스는 하나의 부모클래스를 갖는다
//		  부모클래스가 없으면 Object가 부모클래스이다.
//		  다중상속을 지원하지 않는다.(즉, 부모클래스는 하나만 존재한다.)
//		  다이얼그램에서는 부모A◁-----자식B
public class Ex03_Sub extends Ex03_Super {
	String name = "홍반장";
	int age = 13;
	double weight = 78.9;
	private String cat = "야옹이";

	static String computer = "10세대";
	
	public Ex03_Sub() {
		System.out.println("자식클래스 생성자 :" + this);
	}

	public void play() {
		String name = "홍두께";
		// 변수 우선순위
		// 지역변수 > 전역변수(this)>부모클래스변수(super)
		System.out.println(name);// 홍두께
		System.out.println(this.name);// 홍반장
		System.out.println(super.name);// 홍길동

		// 지역변수가 없고, 전역변수, 부모클래스에게만 있으면
		System.out.println(weight);
		System.out.println(this.weight); //확실하게 할려면 this를 붙이지만, 안 붙여도 된다~

		System.out.println(addr);
		System.out.println(this.addr);
		System.out.println(super.addr);
		
		//private인 경우 
		System.out.println(cat);
		//상속이라도 private은 접근할 수 없다.
		//System.out.println(dog);
		//System.out.println(super.dog);
		
		//static인 경우
		System.out.println(computer);
		System.out.println(Ex03_Sub.computer); //!!스테틱은 무조건 클래스이름. 으로 접근하기!!
		System.out.println(playstation);
		System.out.println(Ex03_Super.playstation);;
		//즉 스테틱은 클래스이름이랑 별 상관없엄, 그냥 클래스이름. 으로 가면 제일 빠름
		
		
	}
}