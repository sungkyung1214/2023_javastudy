package day12.com.ict.edu;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Ex09_Constructor[] arr = new Ex09_Constructor[5];

		System.out.print("이름 : ");
		String name = scan.next();
		// c1.getName(scan.next());

		System.out.print("국어 : ");
		int kor = scan.nextInt();

		System.out.print("영어 : ");
		int eng = scan.nextInt();

		System.out.print("수학 : ");
		int math = scan.nextInt();

		Ex09_Constructor c1 = new Ex09_Constructor(name, kor, eng, math);
	}

}
