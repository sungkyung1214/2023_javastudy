package day05.com.ict.edu;

public class Ex03_for2 {
	public static void main(String[] args) {
		//중첩 for문: for문안에 또다른 for문이 존재
		
		for (int i = 1; i < 4; i++) {
			System.out.println("실행문-1");
		for (int j = 1; j < 6; j++) {
			System.out.println("i="+i+",j="+j);
		}//안쪽 for문끝
		System.out.println("실행문-1");
		}//바깥 for문 끝

	
		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j <10; j++) {
				System.out.print(i + "*" + j +"="+(i*j)+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		System.out.println("============================================================");
		
		
		
		
		//구구단만들기
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
					
				
			}
			System.out.println();
		}
		
		
	
	
		
		
		
	}
}
			
			
			

	
		
	