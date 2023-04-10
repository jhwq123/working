package study_fin;

public class BookVO {

	private static int idx;
	private int num;
	private String name;
	private String author;
	private String publish;

	BookVO(int num, String name) {
		this.num = num;
		this.name = name;
		idx++;
	}

	public static int getIdx() {
		return idx;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public String toString() {
		return "BookVO [num=" + num + ", name=" + name + ", author=" + author + ", publish=" + publish + "]";
	}
	
	
	
}
