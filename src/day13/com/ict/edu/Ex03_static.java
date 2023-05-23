package day13.com.ict.edu;

public class Ex03_static {
	// static 초기화
	// static{
	// 초기화내용
	// }

	int s1 = 100;
	private int p1 = 300;
	static int s2;

	public static int k1 = 100;
	static int k2 = 100;
	private static int k3 = 100;

	
	//static 초기화
	//아래 생정자 만든것처럼 위에 값으로 출력되는게 아니라, 아래에 설정한 값들로 변함
	static {
		m1=1000;
		m2=1000;
		s2 = 1000;
		k2 = 1000;

	}

	// 생성자는 인스턴스 초기화가 목적
	//	초기화라는 뜻은 위에 변수 정한 값이 소용이 없고, 이 아래에 적은 값들로 다 변한 다는 뜻
	public Ex03_static() {
		s1 = 200;
		s2 = 400;
		s3=  500;
	}
	
	
	
	
	int s3;
	static int m1;
	static int m2 = 500;
}
