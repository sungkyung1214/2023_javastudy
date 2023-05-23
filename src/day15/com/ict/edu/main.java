package day15.com.ict.edu;

public class main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		
		System.out.println(cat.eyes);
		//고양이가 갖고있지않지만 부모가 갖고있으니까
		//사용할 수 있다
		System.out.println(cat.color);
		//부모랑 자식이랑 같을 경우에는 자식꺼가 나온다
		
		cat.sound();
		cat.hobby();
		cat.play();
		
	}
}
