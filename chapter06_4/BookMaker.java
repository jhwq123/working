package chapter06_4;

public class BookMaker {

	private int num;
	private String title;
	private String subTitle;
	private String author;
	private String publish;
	private int year;
	private int price;
	
	public BookMaker(int num, String title) { //4
		this.num = num;
		this.title = title;
	}
	
	void setNum(int num) {
		this.num = num;
	}
	int getNum() {
		return num;
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	String getTitle() {
		return title;
	}
	
	void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	String getSubTitle() {
		return subTitle;
	}
	
	void setAuthor(String author) {
		this.author = author;
	}
	String getAuthor() {
		return author;
	}
	
	void setPublish(String publish) {
		this.publish = publish;
	}
	String getPublish() {
		return publish;
	}

	void setYear(int year) {
		this.year = year;
	}
	int getYear() {
		return year;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	int getPrice() {
		return price;
	}
	
	void init() {
		num = 0;
		title = "";
		subTitle = "";
		author = "";
		publish = "";
		year = 0;
		price = 0;
	}
	
	void showInfo() {
		System.out.println(num+"\t | "+title+"\t | "+subTitle+"\t | "+author+"\t | "+year+"\t | "+publish+"\t | "+price+" | ");
	}
	
}
