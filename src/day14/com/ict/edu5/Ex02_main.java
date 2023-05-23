package day14.com.ict.edu5;

public class Ex02_main {
	public static void main(String[] args) {
	 Ex02_Dog dog = new Ex02_Dog();
	 Ex02_Cat cat = new Ex02_Cat();
	 
	 dog.sound();
	 dog.hobby();
	 System.out.println(dog.eyes);
	 System.out.println(dog.color);
	 
	 cat.sound();
	 cat.hobby();
	 System.out.println(cat.eyes);
	 System.out.println(cat.color);
	 
	 //객체생성
	 //부모클래스 변수 = new 자식클래스 생성자();
	 Ex02_Animal animal =null;
	 int su = 1;
	 if(su==1) { //고양이		 
		 animal= new Ex02_Cat();
	 }else if(su==2) { //강아지
		 animal = new Ex02_Dog();
		 
	 }
	 
	 
	 //오버라이딩
	 animal.sound();
	 
	 //부모 것만 나옴
	 System.out.println(animal.color);
	 System.out.println(animal.eyes);
	 
	 //자식클래스가 가지고 있는것을 사용 못함
	 //animal.play();
	 
	 //부모클래스로 선언을 하면 부모클래스가 갖고있는건 다 사용가능
	 //자식클래스만 갖고있는건 사용불가
	 //그치만, 오버라이딩된것은 자식클래스가 우선순위
	 
	 
	}
}
