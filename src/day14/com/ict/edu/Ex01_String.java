package day14.com.ict.edu;

public class Ex01_String {
	public static void main(String[] args) {
		String s1 = "ictedu";
		String s2 = "ictedu";
		String s3 = new String("ictedu");
		String s4 = new String("ictedu");
		char[] ch = { 'i', 'c', 't', 'e', 'd', 'u' };
		String s5 = new String(ch);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println();

		// == 객체의 주소가 같냐? 라는 뜻 즉,내용이 같냐고 물어보는거 아님
		if (s1 == s2) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다");
		}

		if (s1 == s3) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다");
		}

		if (s1 == s4) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다");
		}
		// System.out.println(s1==s5 ?"같다" : "같지않다");
		System.out.println("=========");

		if (s1 == s5) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다");
		}
		System.out.println();
		
		
		//equals(): 내용이 같냐? 내용 물어볼 때 사용
		if (s1.equals(s2)) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다");
		}
		if (s1.equals(s3)) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다");
		}
		if (s1.equals(s4)) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다");
		}
		if (s1.equals(s5)) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다");
		}
		System.out.println();
		
		s1 = s1 + "대한민국";
		System.out.println(s1); //string은 보통 '+'를 쓰지 않는다. 이렇게 바뀌게 되면 그전 s1이 가베지가 된다.
		System.out.println(s2);

	}
}
