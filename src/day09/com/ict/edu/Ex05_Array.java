package day09.com.ict.edu;

public class Ex05_Array {

	public static void main(String[] args) {
		String[] name = { "홍", "김", "이", "박", "고" };
		int kor[] = { 80, 90, 80, 70, 100 };
		int eng[] = { 85, 95, 75, 85, 95 };
		int math[] = { 100, 95, 90, 100, 100 };

		int[] sum = new int[name.length];
		double[] avg = new double[name.length];
		String[] hak = new String[name.length];
		int[] rank = { 1, 1, 1, 1, 1 };

		// for문을 이용해서 반복처리한다.
		for (int i = 0; i < name.length; i++) {
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
			// 순위, 정렬 못함
		}

		// 순위를 구하자=rank
		// 이중포문 sum으로 비교(총점)
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if (sum[i] == sum[j])
					continue;
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}

		// 출력
		System.out.println("이름\t총점\t평균\t힉점\t순위");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + " \t");
			System.out.print(avg[i] + "\t ");
			System.out.print(hak[i] + "\t ");
			System.out.println(rank[i]);// 1로 초기화 해놓은 상태
			// 값을 다 구한 다음에 순위를 정할 수 있음
			// 방 자리에 다 들어가있어야 가능

		}

	}
}
