package day15.com.ict.edu4;

public class Main {
	public static void main(String[] args) {
		//객체생성 한다는 뜻
		Terran terran = new Terran();
		terran.setName("마린");
		terran.setFly(false);
		terran.setEnergy(40);
		
		
		//값 집어넣는 방법 2가지 : 하나는 set이용, 하나는 생성자 이용
		Protoss protoss = new Protoss("질런",80,false);
		Zerg zerg = new Zerg("뮤탈",120,true);
		
		terran.decEnergy();
		zerg.decEnergy();
		protoss.decEnergy();
		
		System.out.println("terran 에너지 : " +terran.getEnergy());
		System.out.println("protoss 에너지 : " +protoss.getEnergy());
		System.out.println("zerg 에너지 : " +zerg.getEnergy());
		System.out.println();
		
		terran.decEnergy();
		terran.decEnergy();
		
		System.out.println("terran 에너지 : " +terran.getEnergy());
		System.out.println("protoss 에너지 : " +protoss.getEnergy());
		System.out.println("zerg 에너지 : " +zerg.getEnergy());
	}
}
