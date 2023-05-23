package day11.com.ict.edu;

import java.util.Scanner;

public class Ex07_main {
	public static void main(String[] args) {
		// 5명의 이름, 국어, 영어,수학을 입력 받아서
		// 이름, 총점,평균, 학점, 순위를 구하고
		// 순위를 기준으로 오름차순 정렬해서 출력하자
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];

		Ex07_method test = new Ex07_method();

		for (int i = 0; i < hak.length; i++) {
			System.out.print("이름 : ");
			name[i] = scan.next();

			System.out.print("국어 : ");
			kor[i] = scan.nextInt();

			System.out.print("영어 : ");
			eng[i] = scan.nextInt();

			System.out.print("수학 : ");
			math[i] = scan.nextInt();
			
			
			//void 는 자기가 혼자 갖고있기 떄문에 ex06처럼 코드를 짜면 오류발생
			//또 void는 발생하는 순서대로 값을 가져가기때문에
			//총점>평균>학점 순으로 제대로 해줘야함

			// 총점
			test.getSum(kor[i], eng[i], math[i]);//여기까지는그냥 실행, 구해진 값 저장 전
			sum[i] = test.sum;//이렇게 해야 메서드 자료에서의 int가 바껴서 저장
			
			
			// 평균
			test.getAvg();
			avg[i]=test.avg;

			// 학점
			test.getHak();//하는순간 메서드로 날라감 그래서 알아서 학점을 구해줌 그 다음에 메서드 맨위 변수 hak에 결과가 저장
			//그 다음에 나는 저장된 값을 불러오는 작업을 아래에다가 함
			hak[i]=test.hak;

		}

		// 출력
		for (int i = 0; i < hak.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.println(hak[i] + "\t");// "\t"를 삭제해도 됨
		}

		// 평균구하기

		// 학점 구하기

		// 순위 구하기

		// 순위 기준으로 오름차순 정렬

		// 출력

	}
}
