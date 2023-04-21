package _Bread;

import lombok.Data;

// 빵에 들어가는 기본베이스는 같다. (밀가루, 물, 이스트 조금)
// 들어가는 앙고가 차이가 나며, 외부에서 받아야 한다.
// (크림, 단팥, 피자, 메론, 명란)

@Data
public class Bread {
	final private int flour = 200;
	final private int water = 50;
	final private int yeast = 10;
	private String sauce;

	Bread(String sauce) {
		this.sauce = sauce;
	}

}
