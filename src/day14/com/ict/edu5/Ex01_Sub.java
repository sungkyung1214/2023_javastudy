package day14.com.ict.edu5;

public class Ex01_Sub extends Ex01_Super{
	int weight = 35;
	
	@Override //annotation 알아오기 개별적으로
	public void sound() {
		System.out.println("음악소리");
	}
	
	
	public void hobby() {
		System.out.println("잠자기");

	}
}
