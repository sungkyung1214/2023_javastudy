package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_Map {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("한국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");

		Scanner scan = new Scanner(System.in);

		esc: while (true) {
			System.out.print("나라를 입력하세요 :");
			String nation = scan.next();
			if (map.containsKey(nation)) {
				System.out.println(nation + "수도는" + map.get(nation) + "입니다");
			} else {
				System.out.println("없는정보입니다. 다시입력하세요");
				continue esc;
			}

			while (true) {
				System.out.print("계속할까요?(y/n)");
				String ans = scan.next();
				if (ans.equalsIgnoreCase("y")) {
					continue esc;
				} else if (ans.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("잘못 입력하셨습니다");
				}
			}

		}
	}
}
