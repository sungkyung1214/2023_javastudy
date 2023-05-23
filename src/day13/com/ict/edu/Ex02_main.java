package day13.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		
		//객체 생성전에도 호출가능하다는 설명에 대한 출력해보기
		//생성전임에도 불러오면, static 이라서 불러오는게 가능
		System.out.println(Ex02_static.su2);
		System.out.println();
		
		
		Ex02_static p1 = new Ex02_static();
		
		
		System.out.println(p1.su1);
		System.out.println(p1.su2);

		Ex02_static p2 = new Ex02_static();
		System.out.println(p2.su1);
		System.out.println(p2.su2);

		Ex02_static p3 = new Ex02_static();
		System.out.println(p3.su1);
		System.out.println(p3.su2);
		System.out.println();
		
		System.out.println(p1.su1);
		System.out.println(p1.su2);
		
		
		
	}
}
