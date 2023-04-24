package _subway;

import lombok.Data;

@Data
public class Meat {

	private String meat;

	Meat(String meat) {
		this.meat = meat;
	}
}
