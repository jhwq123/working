package rpgGame;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PlayerVO {

	private int rank;
	private String name;
	private int score;

	PlayerVO(String name, int score) {
		this.name = name;
		this.score = score;
	}

}
