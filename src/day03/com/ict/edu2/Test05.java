package day03.com.ict.edu2;

public class Test05 {
	public static void main(String[] args) {
		int su = 3781 ;
		
		//결과
		//천의자리 : 3
		//백의자리 : 7
		//십의자리 : 8
		//일의자리 : 1
		
		
		//3781에서 1000으로 나누기 >3 나머지 781
		//781에서 100으로 나누기 > 7 나머지 81
		//81에서 10으로 나누기 >8 나머지 1
		
		
	int c = 0 ;
	int b = 0 ;
	int s = 0 ;
	int i = 0 ;
	int res = 0 ;
	
	c = su /1000; //3
	res =su % 1000; //781
	
	b = res /100; //7
	res = res % 100; //81
	
	s = res/ 10 ; //8
	i= res %10 ; //1
	
	
	
	System.out.println("천의자리 :" + c);
	System.out.println("백의자리 :" + b);
	System.out.println("십의자리 :" + s);
	System.out.println("일의자리 :" + i);
		

		
		
		
	}
}
