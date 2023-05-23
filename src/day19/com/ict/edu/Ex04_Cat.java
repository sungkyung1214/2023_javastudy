package day19.com.ict.edu;

public class Ex04_Cat implements Runnable{

	
	@Override
	public void run() {
		while(true) {
			// 3초간 대기상태
			try {
				Thread.sleep(1000*3); // 1000 이 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("냐옹쓰~~");
		}
		
	}
}
