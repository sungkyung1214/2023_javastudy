package day12.com.ict.edu;

import java.util.Scanner;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03_get_set coffee = new Ex03_get_set();
		coffee.setName("커피음료");// 저장하는것: 값 넣는것
		coffee.setPrice(1000);
		
		Ex03_get_set ion = new Ex03_get_set();
		ion.setName("이온음료");
		ion.setPrice(1500);

		Ex03_get_set cola = new Ex03_get_set();
		cola.setName("탄산음료"); 
		cola.setPrice(1200); 

		Ex03_get_set juice = new Ex03_get_set();
		juice.setName("과일음료");
		juice.setPrice(18000);

		// 배열을 만들어서 한칸한칸마다 한개씩 클래스자료형을 넣어주자
		// 근데 너무 길어서 한줄로 만들자
		/*
		 * Ex01_method[]arr = new Ex01_method[4]; arr[0]=coffee; arr[1]=ion;
		 * arr[2]=cola; arr[3]=juice;
		 */

		// 미리 만들어진걸 넣을때는 {} 이걸로 넣는게 편하다
		Ex03_get_set[] arr = { coffee, ion, cola, juice };

		// 그러면 이제 스캐너로 금액 받자
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입하세요>>>");
		int input = scan.nextInt();

		// 음료들의 최소금액을 구하자
		// 왜 구해야하냐? 최소금액보다(예를 들어 500원) 작게들어오면 출력될것이 없기 때문에
		// 정렬 최소값/최대값
		// 오름차순에서 맨 처음 최소값, 맨 끝이 최대값

		if (input < 1000) {
			System.out.println("금액이 부족합니다");
			System.out.println("잔돈 : " + input);
		} else {
			System.out.println("커피\t이온\t탄산\t과일");
		}

		// 입력금액과 각 음료수의 가격을 비교
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getPrice() <= input) {
				System.out.print("O\t");
			} else {
				System.out.print("X\t");
			}
		}

		System.out.println();
		System.out.println("선택하세요>>");
		String drink = scan.next();
		int output = 0;
		switch (drink) {
		case "커피":
			output = input - arr[0].getPrice();
			break;
		case "이온":
			output = input - arr[0].getPrice();
			break;
		case "탄산":
			output = input - arr[0].getPrice();
			break;
		case "과일":
			output = input - arr[0].getPrice();
			break;
		default:
			System.out.println("잘못선택했수다");
			output = input;
		}

	}
}
