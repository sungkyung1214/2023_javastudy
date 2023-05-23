package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;



public class Ex09_Map {
	// Map 인터페이스 : key와 Value가 1:1 매핑 구조를 가지고 있따
	//				  key는 중복 될 수 없다.(기존 value가 삭제된다. 즉, 덮어쓰기)
	//				  Value는 중복 가능
	//				  key를 호출 Value가 나온다.
	//				  key를 별도로 관리(Set으로 관리) =>keySet()
	//				  add()추가를 못함
	//				 put(key, Value)로 추가할 수 있다.
	// 관련 클래스 : HasfMap
	
	
	public static void main(String[] args) {
		
		// 생성 (key가 숫자, Value는 문자열인 경우)
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(0, "한국");
		map1.put(1, "미국");
		map1.put(2, "영국");
		map1.put(8, "태국");
		map1.put(10, "중국");
		map1.put(5, "남아프리카공화국");		
		System.out.println(map1);
		
		map1.put(10, "대만");
		System.out.println(map1);
		
		// 하나씩 출력 get(key)
		System.out.println(map1.get(2)); 
		System.out.println(map1.get(3)); //null; 값이 없을 떄는 null로 나옴
		
		//삭제 : remove(key) : key, value 삭제,
		map1.remove(5);
		System.out.println(map1);
		
		
		// key를 set에서 관리하게 한다. => keySet();
		// key랑 set 둘다 중복이 안되기 때문에 맞아 떨어지는것이다.
		
		//출력방법1  key값 사용해서 value 값 가져오기
		for (Integer k : map1.keySet()) {
			//System.out.println(k); // key 값 출력
			System.out.println(map1.get(k)); // value 값 출력
		}
		System.out.println();
		
		
		//출력방법2 key값 사용해서 value 값 가져오기
		Iterator<Integer> it =  map1.keySet().iterator();
		while (it.hasNext()) {
			Integer k = (Integer) it.next();
			System.out.println(map1.get(k));
			//★★★★★System.out.println(k + ":" + map1.get(k)); //밑에 while문 대신 이렇게 많이 쓴다.
			//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		}
		
		//순서대로 맞주지 않아서 for 문으로 맞출 수 없다, 게다가 String 들어가면 아예 못 쓴다.
		//그래서 map은 keySet에서 따로 관리한다.
		//출력할때는 for문을 쓰긴한데 좀 정리해서 써야하고 그래서 iterator 쓰는게 맞다!!
		
		
		
		
		// entrySet() 메서드는 key, value의 값이 모두  필요한 경우 사용
		Set set1 = map1.entrySet();
		System.out.println(set1);
		
		Iterator it2 = set1.iterator();
		while (it2.hasNext()) {
			Entry entry = (Entry) it2.next();
			Integer key = (Integer)entry.getKey();
			String value = (String)entry.getValue();
			System.out.println(key+":"+value);
		}
		
}
}
