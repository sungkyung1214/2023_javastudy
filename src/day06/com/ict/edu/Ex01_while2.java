package day06.com.ict.edu;

public class Ex01_while2 {
	public static void main(String[] args) {
		// 구구단 -1
		int i = 2;
		while (i < 10) {
			int j = 1;
			while (j < 10) {
				System.out.println(i + "*" + j + "=" + (i * j));
				j++;
			}
			i++;
		}

		// 구구단-2
		i = 2;
		while (i < 10) {
			int j = 1;
			while (j < 10) {
				System.out.println(j + "*" + i + "=" + (i * j));
			}
			System.out.println();
			i++;
		}
		System.out.println("=============");

//구구단 -3

		i = 1;
		while (1 < 10) {
			int j = 2;
			while (j < 10) {
				System.out.println(j + "*" + i + "=" + (j * i) + " ");
				j++;
			}
			System.out.println();
			i++;
		}

	}
}
