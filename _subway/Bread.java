package _subway;

import lombok.Data;

@Data
public class Bread {

	private String bread;

	Bread(String bread) {
		this.bread = bread;
	}

}
