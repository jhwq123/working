package chapter06_5;

public class Member {

	private int mno;
	private String name;
	private String phone;
	private String email;
	
	public Member(int mno, String name, String phone) {
		this.mno = mno;
		this.name = name;
		this.phone = phone;
	}
	
	void setMno(int mno) {
		this.mno = mno;
	}
	int getMno() {
		return mno;
	}
	
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	
	void setPhone(String phone) {
		this.phone = phone;
	}
	String getPhone() {
		return phone;
	}
	
	void setEmail(String email) {
		this.email = email;
	}
	String getEmail() {
		return email;
	}
	
	public String toString() {
		String s = ("번호: "+mno+" | 이름: "+name+" | 전화번호: "+phone);
		
		if(email != null) {
			s = s + (" | Email: "+email);
		}
		return s;
	}
}
