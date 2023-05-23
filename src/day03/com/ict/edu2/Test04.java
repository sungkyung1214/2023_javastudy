package day03.com.ict.edu2;

public class Test04 {
	public static void main(String[] args) {
		// 카페모카 6,500이다.
		// 친구와 둘이서 15,000원을 내고 주문했다
		// 잔돈은 얼마인가?(단, 부가세 10%포함)

		int su1 = 6500;
		int su2 = su1*2;
		int su3 = su2 + (int)(su2*0.1) ; //14300
		int su4 = 15000-su3 ;
		
		System.out.println(su3);
		System.out.println(su4);
		
		
		System.out.println("=============");
		
		//입력
		String coff="카페모카";
		int dan = 6500;
		int su =2;
		int in =15000;
		
		//부가세를 구하기 위해서 총금액을 구하자
		int total =dan*su;
		
		//둘 중 하나만 사용하자
		int vat = total/10;
		int vat2 = (int) (total*0.1);
		int out = in - (total + vat) ;
			
			System.out.println("잔돈:"+ out);
			
		// 위 정보를 한번에 처리하는 방법
		int out2 = in - (int)(total*1.1);
		System.out.println("잔돈:"+ out2);
		
		
		
	}
}
