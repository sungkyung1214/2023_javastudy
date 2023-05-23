package day03.com.ict.edu2;

public class Test02 {
	public static void main(String[] args) {
		//2시간40분 30초는 몇초일까요?
		
		
		int su1= 2;
		int su2= 40;
		int su3 =30;
		
	  su1= su1*60*60;
      su2 =su2*60 ;
      
      int sum = su1 + su2 + su3;
      System.out.println(sum+"초");

	 System.out.println("===================");
		int h = 2*60*60;
		int m= 40*60;
		int s= 30;
		int result = h+m+s;
		System.out.println("2시간40분30초는"+result+"초 입니다.");
	
			
	}
}
