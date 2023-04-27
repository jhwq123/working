package study_230426;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("root", "1234");
		map.put("user01", "1111");
		map.put("admin", "1234");

		System.out.println(map.get("root"));
		System.out.println(map.get("user01"));
		System.out.println(map.get("admin"));
		System.out.println(map);

//		map.remove("admin");
//		System.out.println(map);

		for (String key : map.keySet()) { // 맵안에 키 값만 모아놓은것. 중복 허용x 배열
			String value = map.get(key);
			System.out.println("key : " + key + ", value : " + value);
		}

		// 반복자
		System.out.println("=====");
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println("key : " + key + ", value : " + value);
		}

		// forEach
		System.out.println("=====");
		map.forEach((key, value) -> {
			System.out.println("key : " + key + ", value : " + value);
		});
	}
}
