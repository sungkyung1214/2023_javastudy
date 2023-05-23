package day19.com.ict.edu;

public class Ex03_Main {
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());
		
		Ex03_Cat cat = new Ex03_Cat();
		Ex03_Dog dog = new Ex03_Dog();
		
		//Runnable은 메서드가 run()만있어서 start()메서드를 실행하면 오류 발생!!!!
		//cat.start();
		
		Thread thread = new Thread(dog);
		thread.start();
		
//		Thread thread2 = new Thread(cat);
//		thread2.start();
		
		// 익명. 단점은 일회용으로 다시 호출 불가능
		new Thread(cat).start();
		
		// 익명 : new 클래스(인터페이스 i) : 인터페이스가 있는 클래스를 받아오면 아래처럼 익명처리 할 수 있다.
		// new Thread();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.println("AAAAAAAAAA : " + Thread.currentThread().getName());
				}
				
			}
		}).start();
		
		System.out.println("main : " + Thread.currentThread().getName());
	}
}
