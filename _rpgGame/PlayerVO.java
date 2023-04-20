package _rpgGame;

import lombok.Data;

@Data
public class PlayerVO {

	private int rank;
	private String name;
	private int score;

	PlayerVO(String name, int score) {
		this.name = name;
		this.score = score;
	}

}
