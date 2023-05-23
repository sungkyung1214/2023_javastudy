package day18.com.ict.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex07_List {
	// List 인터페이스 : 배열과 흡사한 구조
	// 삽입, 삭제, 추가가 자유롭다.
	// 크기를 미리 지정하지 않아도 된다.
	// List 인터페이스를 구현한 클래스 : Stack, ArrayList, Vector;

	// ArrayList : 멀티스레드 동기화 지원 안함
	// Vector : 멀티스레드 동기화 지원 함 // 동시에 여러명이 한 가지 일을 처리할때(ex:티켓팅)
	// ArrayList 와 Vector 사용법은 같다.

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Vector<String> vector = new Vector<>();

		list.add("손흥민");
		list.add("이강인");
		list.add("김민재");
		list.add("손흥민"); // 중복 가능 , stack도가능했었음. 즉 list는 다 중복이 가능

		vector.add("손흥민");
		vector.add("이강인");
		vector.add("김민재");
		vector.add("손흥민");

		list.add(1, "차범근"); // 삽입가능 인덱스값으로 들어간거임
		vector.add(1, "차범근"); // 삽입가능

		System.out.println(list);
		System.out.println();
		System.out.println(vector);
		System.out.println();

		// 검색 : search(), elementAt(), firstElement(), lastElement() : list 다 없음
		//				   elementAt(), firstElement(), lastElement() : vector에는 있음
		// indexOf로만 검색 가능
		if (list.contains("손흥민")) {
			System.out.println(list.indexOf("손흥민"));
			System.out.println(list.lastIndexOf("손흥민"));

			// 치환
			list.set(list.lastIndexOf("손흥민"), "박지성");

		}
		System.out.println(list);
		
		//vector 로 해보기~!!
		if (vector.contains("손흥민")) {
			System.out.println(vector.indexOf("손흥민"));
			System.out.println(vector.lastIndexOf("손흥민"));

			// 치환
			vector.set(vector.lastIndexOf("손흥민"), "차두리");
			System.out.println(vector.firstElement());
			System.out.println(vector.lastElement());

		}
		System.out.println(vector);
		
		// 출력 : 개선된 for문, iterator 를 사용하면 된다!!
		//Ex06 예제를 보자!! 똑같다~~~~~~~~
		
		for (String k : list) {
			System.out.println(k+"골");
		}
		System.out.println();
		
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k +"킥");
		}
		
		// 삭제 : remove
		list.remove("박지성");
		vector.remove("차두리");
		System.out.println(list);
		System.out.println(vector);
		
		
		
		
		
		
		
		
	}

}
