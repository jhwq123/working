package study_230411;

import java.io.Serializable;

public class DinnerVO implements Serializable {

	private static final long serialVersionUID = -252779896088505086L;
	private static int idx;
	private int num;
	private String name;
	private String[] review;
	private int reviewIdx;
	private int[] rank;
	private int rankIdx;

	DinnerVO() {
		this.num = idx;
		idx++;
	}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setReview(String review) {
		this.review[reviewIdx] = review;
		reviewIdx++;
	}

	public String getReview() {
		String result = "";
		result += "\n";
		for (int i = 0; i < review.length; i++) {
			result += review[i] + "\n";
		}
		return result;
	}

	public void setRank(int rank) {
		this.rank[rankIdx] = rank;
		rankIdx++;
	}

	public int getRank() {
		int result = 0;
		for (int i = 0; i < rank.length; i++) {
			result += rank[i];
		}
		result = result / rank.length;
		return result;
	}

	@Override
	public String toString() {
		return "Dinner [num=" + num + ", name=" + name + ", review=" + review[0] + ", rank=" + getRank() + "]";
	}

}
