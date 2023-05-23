package day19.com.ict.edu;

public class Ex03_Dog implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("왈왈" + Thread.currentThread().getName());
		}
		
	}

}
