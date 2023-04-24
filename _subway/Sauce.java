package _subway;

import lombok.Data;

@Data
public class Sauce {

	private String sauce;

	Sauce(String sauce) {
		this.sauce = sauce;
	}
}
