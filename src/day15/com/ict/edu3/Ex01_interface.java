package day15.com.ict.edu3;

// 인터페이스 : 서비스를 제공하는 목록
// 			  상수와 추상메서드만 가지고 있다.
//			  일반적인 변수와 일반적인 메서드는 존재하지 않는다.
//			  객체 생성 안됨( 생성자도 없다.)
//			  다중 상속 할 수 있다.(인터페이스는 여러개의 인터페이스를 부모로 만들 수 있다.)
//			  일반클래스를 부모로 만들 수 없다. (상수와 추상메서드가 있는데 클래스는 그게 불가하니까)
//			  '인터페이스가 같다' 라는 말은 대체가 가능하다. 호환이 가능하다.
		  
// 인터페이스 상속 : 인터페이스 extends 인터페이스,  클래스 extends  클래스,  클래스 --- implement---▷ 인터페이스
public interface Ex01_interface {
	//모두다 static final 이다. 그냥 final 도 아니고 static final
	final int su1 = 10;
	static final int su2 = 20;
	int su3 = 30;
	static int su4 = 40;
	
	// 추상메서드
	public abstract void sound();
	//abstract를 안 써도 인터페이스가 그냥 추상 메서드가 되도록 만들어놨다
	public void play();
	
	// 일반메서드 사용 불가
	//public void hobby() {};
	public static void like(){
	System.out.println("놀기 좋아");	
	}
}
//실제로는 객체생성이랑은 상관없다..!!