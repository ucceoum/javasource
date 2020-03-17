package basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("id1234", "홍길동");
		map.put("id1235", "박길동");
		map.put("id1236", "김길동");
		map.put("id1237", "이길동");
		map.put("id1237", "최길동");
		//키 중복 x, 나중에 담은것이 남음
		
		
		System.out.println("총 Entry 수 : "+map.size());
		System.out.println("객체 찾기 : "+map.get("id1237"));
		System.out.println("객체 삭제 : "+map.remove("id1237"));
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			String value = map.get(key);
			System.out.println(key+" : "+value);
		}
		
		
		
		
	}

}
