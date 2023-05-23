package day07.com.ict.edu;

import java.util.Iterator;

public class Test01 {
	public static void main(String[] args) {
		// 1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10)
		// for문을 이용한 누적합

		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				sum = sum + (i * -1);
			} else {
				sum = sum + i;
			}
		}
		System.out.println("결과 : " + sum);
		System.out.println("============");

		// 농구공 5개씩 한 박스에 들어간다
		// 40개면 8상자, 26개면 6상자이다.
		// int k1 = 127개이다. 몇상자가 필요한가?

		int k1 = 127;
		int res = k1 / 5;
		if (k1 % 5 != 0) {
			res = res + 1;
		}
		System.out.println("결과 : " + res);
		System.out.println("============");

		// for문
		// 0000
		// 0000
		// 0000
		// 0000을 한 줄로 보는 방법// '0' 한개를 하나로 보는 방법

		// 0000을 하나로 보는경우 > 4번 돌기
		for (int i = 0; i < 4; i++) {
			System.out.println("0 0 0 0");
		} // 포문은 횟수 돌릴때 무조건 0부터 시작하는걸로 생각하기

		System.out.println("============");

		// 0을 하나로 보는 방법
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			if (i % 4 == 0) {
				System.out.println();
			}
		}
		System.out.println("============");
		// 1000
		// 0100
		// 0010
		// 0001
		// 이중 for문
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					System.out.print("1 ");
				}else {
				System.out.print("0 ");
				}
			}
			System.out.println();// 이렇게하면 위랑 똑같이 출력);
		}

		System.out.println("============");
		//1 + (-2) + 3 + (-4)..
		//몇까지 더해야 총합이 100이상이 되는지 구하라
		int sum2 = 0;
		int cnt =0;
		for (int i = 0; i < 99; i++) {
			if(i%2==0) {
				sum2=sum2+(i*-1);
			}else {
				sum2=sum2+(i*1);
			}
			cnt =i;
			if(sum2>=100) {
				break;
			}
		}
		System.out.println(cnt);
		
		
		
		
		
		
		
		
		
		
	}

}
