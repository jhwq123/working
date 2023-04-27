package study_230426;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 나만의 과일사전
// 한영사전 같은것들 1:1 뜻 매핑시키면 사전기능 가능.
public class DictionarySimple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, String> eList = new HashMap<>();
		eList.put("과일", "Fruits");
		eList.put("사과", "Apple");
		eList.put("바나나", "Banana");
		eList.put("포도", "Grape");
		eList.put("복숭아", "Peach");
		eList.put("오렌지", "Orange");
		eList.put("자두", "Plum");
		eList.put("수박", "Watermelon");
		eList.put("체리", "Cherry");
		eList.put("파인애플", "Pineapple");
		eList.put("레몬", "Lemon");
		eList.put("키위", "Kiwi");
		eList.put("딸기", "Strawberry");
		eList.put("멜론", "Melon");

		System.out.println("나만의 과일 사전");
		System.out.print("나만의 번역 단어 입력>> ");
		String uName = sc.next();
		String value = null;
		for (String name : eList.keySet()) {
			if (name.equals(uName)) {
				value = eList.get(name);
			}
		}

		if (value != null) {
			System.out.println("KOR: " + uName + "\t|\tENG: " + value);
		} else {
			System.out.println("사전에 없는 단어입니다.");
		}

		sc.close();
	}
}
