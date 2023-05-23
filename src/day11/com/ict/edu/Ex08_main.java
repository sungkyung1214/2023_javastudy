package day11.com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		// 5명의 이름, 국어, 영어,수학을 입력 받아서
		// 이름, 총점,평균, 학점, 순위를 구하고
		// 순위를 기준으로 오름차순 정렬해서 출력하자

		// 배열 안 만들고 클래스를 만들어서 풀자

		Scanner scan = new Scanner(System.in);

		// Ex08_method로 만들어진 객체만 저장하는 배열(객체형 배열 = 참조자료형 배열)
		// int[]k1 = new int[];
		// ^기본자료형 자리인데 그거 대신 클래스를 넣는것 그래서 밑에를 보면
		Ex08_method[] arr = new Ex08_method[5];

		for (int i = 0; i < arr.length; i++) {
			Ex08_method person = new Ex08_method();

			System.out.print("이름 : ");
			person.name = scan.next();

			System.out.print("국어 : ");
			person.kor = scan.nextInt();

			System.out.print("영어 : ");
			person.eng = scan.nextInt();

			System.out.print("수학 : ");
			person.math = scan.nextInt();

			person.sum = person.kor + person.eng + person.math;
			person.avg = (int) (person.sum / 3.0 * 10) / 10.0;

			if (person.avg >= 90) {
				person.hak = "A학점";
			} else if (person.avg >= 80) {
				person.hak = "B학점";
			} else if (person.avg >= 70) {
				person.hak = "C학점";
			} else {
				person.hak = "F학점";
			}

			person.rank = 1;

			arr[i] = person; // 배열 첫번째 자리에다가 넣기

			
		}

		// 순위

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				if (arr[i].sum < arr[j].sum) {
					arr[i].rank++;
				}
			}
		}

		// 정렬
		// 임시저장
		Ex08_method tmp = new Ex08_method();

		// 오름차순 정렬
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].rank > arr[j].rank) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].name + "\t");
			System.out.print(arr[i].sum + "\t");
			System.out.print(arr[i].avg + "\t");
			System.out.print(arr[i].hak + "\t");
			System.out.println(arr[i].rank);

			// 정렬

			// int[] k1 = new int[5]
			// 칸5개의 arrd의 주소가 Ex08_method[] arr= new Ex08_method[5]
			// 처음 person을 1칸에 그다음은 2칸에
			// 배열이니까 처음칸부터는 index[0]
			// arr[0][(클래스(.이 들어가는거)는이름을 부름)

			

		}
	}
}
