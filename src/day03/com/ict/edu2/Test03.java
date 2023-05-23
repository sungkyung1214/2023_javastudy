package day03.com.ict.edu2;

public class Test03 {
	public static void main(String[] args) {
		// 3989초는 몇시간, 몇분 몇초인가
	
	int su1= 3989;
	int su2 = su1%60; //%가 나머지 구하는 거
	
	//3989초 나누기 60 하면 몫, 나머지=초
	//몫 나누기 60 몫=시간
	
	System.out.println(su2);
	
	 System.out.println("===================");
	 
	 int time = 3989;
	 int h = 0 ;
	 int m = 0 ;
	 int s = 0 ;
	 int res = 0; //나머지
	 //이것들을 구하기 위해서 미리 공간을 저장해놓는다는 개념
	 
	h = time/(60*60); //1
	res= time%(60*60); //389
	m= res/60;//분
	s= res%60;//초
	/*System.out.println(h);
	System.out.println(res);
	System.out.println(m);
	System.out.println(s);*/
	System.out.println("3989초는"+h+"시간"+m+"분"+s+
			"초입니다.");

	
	
	
	
	}
}
