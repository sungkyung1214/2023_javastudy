package day09.com.ict.edu;

public class Ex11_Array {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		// 번호, 총점, 평균, 학점, 순위
		int[] p1 = { 1, 270, 90, 'A', 1 };// 3
		int[] p2 = { 2, 210, 70, 'C', 1 };// 4
		int[] p3 = { 3, 180, 60, 'F', 1 };// 5
		int[] p4 = { 4, 300, 100, 'A', 1 };// 1
		int[] p5 = { 5, 285, 95, 'A', 1 };// 2
		// arr[i][4] <arr[j][4] arr[i]를 앞으로 보내고싶다

		// 1차원 배열을 다차원배열 넣자
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		arr[4] = p5;

		// 순위를 구하자
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;// (자기자신제외)
				if (arr[i][1] < arr[j][1]) {
					arr[i][4]++;
				}
			}
		}

		// 순위만 일단 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		// 자리변경을 위한 임시변수 필요
		int[] tmp = new int[p1.length];// 한단락이 통째로 움직여야해서 5개로 만들기
		// int[] tmp ={0,0,0,0,0}
		// int[]tmp= new int[5]

		// 순위로 오름
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {// 여기까지가 순위 구하는 기본적인 포맷
				if (arr[i][4] > arr[j][4]) { // 순위바꾸기
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}

		}
		System.out.println("==========================");
		// 출력 + 학점 바꾸기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 3) {
					System.out.print((char) arr[i][j] + "\t");
				} else {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}

		/*
		 * for (int i = 0; i < rank.length; i++) { System.out.print(rank[i]+ " "); }
		 * System.out.println();
		 * 
		 */

		// 순위로 오름

		// 출력
		/*
		 * 4,300,100,'A',1 //arr[0] = 순위정렬한후 1등 5,285,95,'A',2 //arr[1] = 순위정렬한후 2등
		 * 1,270,90,'A',3 2,210,70,'C',4 3,180,60,'F',5
		 */

	}
}
