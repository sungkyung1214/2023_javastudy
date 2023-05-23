package day19.com.ict.edu;

//추상 메서드, 상수 그리고 런 메서드만 갖고있다 근데 이게 추상 메서드
public class Ex03_Cat implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("냥냥펀치" + Thread.currentThread().getName());
		}
		
	}
	
	
}
