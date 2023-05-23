package day14.com.ict.edu;

import java.util.StringTokenizer;

public class Ex02_StringBuffer {
	public static void main(String[] args) {
		// 문자열을 추가할때 사용 (메모리 주소가 변경되지 않는다.)
		// 추가할 때 append() 사용
		// toString() => String 전환한다.
		StringBuffer sb = new StringBuffer("ictedu");
		// 추가 : 각종 자료형을 다 추가할 수 있다 : 당연히 그 자료형들은 다 StringBuffer로 반환된다
		sb.append("대한민국");

		// System.out.println(sb); => 이것도 틀린표현은 아니지만 잘 안쓴다.
		System.out.println(sb.toString());

		// StringTokenizer : 구분자를 이용해서 문자열 분리, split 과 차이점은 배열의 크기를 지정 못함
		// 구분자(쉼표, )가 없으면 (띄어쓰기, 탭, 줄바꾸기)
		// nextToken()를 이용해서 문자열 분리

		// split(String regex) : String[] //구분자 즉 String regex 를 안쓰면 오류
		// split(String regex, int limit ) : String[]
		// regex => 구분자(나눌 기준, limit => 배열의 크기 (방의 갯수)

		String str = "사과 바나나 망고 오렌지 수박";
		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreElements()) {
			String res = st.nextToken(); //토큰을 끄집어내야 커서가 다음으로 옮겨감
			System.out.println(res);
		}
		System.out.println();
		
		
		str = "사과,바나나,망고,오렌지,수박";
		// 구분자 있음
		// split 과 다른 점은 크기 지정 못함
		StringTokenizer st2 = new StringTokenizer(str, ",");
		while (st2.hasMoreElements()) {
			String res = st2.nextToken(); //토큰을 끄집어내야 커서가 다음으로 옮겨감
			System.out.println(res);
		}
		System.out.println();
		
		
		// 추천!!!!!!!!!보통은 배열로 출력
		String[]arr =str.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
