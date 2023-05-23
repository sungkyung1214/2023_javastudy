package day09.com.ict.edu;

import java.util.Scanner;

public class Ex06_Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int su = scan.nextInt();
		
		int kor[] = new int[su];
		int eng[] = new int[su];                                                      
		int math[] = new int[su];
		String name[] = new String[su];

		for (int i = 0; i < su; i++) {

			System.out.print("이름 : ");
			name[i] = scan.next();

			System.out.print("국어점수 : ");
			kor[i] = scan.nextInt();

			System.out.print("영어점수 : ");
			eng[i] = scan.nextInt();

			System.out.print("수학점수 : ");
			math[i] = scan.nextInt();
		}

		System.out.println("===========================");

		int[] sum = new int[su];
		double[] avg = new double[su];
		String[] hak = new String[su];
		int[] rank = new int[su];

		for (int i = 0; i < su; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int) (sum[i] / 3.0 * 10) / 10.0;
			if (avg[i] >= 90) {
				hak[i] = "A 학점";
			} else if (avg[i] >= 80) {
				hak[i] = "B 학점";
			} else if (avg[i] >= 70) {
				hak[i] = "C 학점";
			} else {
				hak[i] = "F 학점";
			}
		}

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if (sum[i] == sum[j])
					continue;
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + " \t");
			System.out.print(avg[i] + "\t ");
			System.out.print(hak[i] + "\t ");
			System.out.println(rank[i] + 1);
		}
	}
}
