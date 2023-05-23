package day14.com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		// 자식클래스를 객체로 만들면 먼저 부모클래스는 알아서 만들어진다.
		Ex03_Sub sub = new Ex03_Sub();
		System.out.println("메인에서 생성자 호출 :" + sub);
	
		System.out.println(sub.name);
		System.out.println(sub.age);
		System.out.println(sub.addr);
	
		//외부에서는 ptrivate 호출 안됨
		//System.out.println(sub.cat);
		//System.out.println(sub.dog);
		
		//static( 접근제한자가 우선순위가 높다. private 제외한 스테틱은)
		System.out.println(Ex03_Sub.computer);
		System.out.println(Ex03_Super.playstation);
		
	}
	
}
//클래스를 사용할려면 객체로 만들어야함
//자식이나 부모 클래스를 사용할라면 객체로 만들어놔야함
//자식 전에 부모 클래스가 먼저
