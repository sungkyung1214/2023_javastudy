package day12.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		Ex02_get_set p1 = new Ex02_get_set();
		
		//이름 가져오기
		//String str = p1.name;//반환형은 무조건 자료형을 넣어줘야한다
		
		p1.getName();
		String str = p1.getName();
		System.out.println(str);
		
		
		
		//이름 변경
		//p1.name="일지매";
		p1.setName("일지매");
		//String res = p1.name; //이름을 바꿔줄때는 이 문단처럼 저장해주는 코드가 한번 더 필요하다
		String res = p1.getName(); 
		System.out.println(res);
	}
}
