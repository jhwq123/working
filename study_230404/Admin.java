package study_230404;

public class Admin {

	private static String id = "admin";
	private static String pw = "1234";
	private static boolean manage;
	
	public Admin(String id, String pw) {
		this.id = id;
		this.pw = pw;
		manage = false;
	}
	
	static public Boolean getManage() {
		return manage;
	}
	
	static void verify(String id_pri, String pw_pri) {
		if(id.equals(id_pri) && pw.equals(pw_pri)) {
			manage = true;
			System.out.println("승인되었습니다.");
		} else {
			manage = false;
			System.out.println("아이디 또는 패스워드가 다릅니다, 다시 시도하세요.");
		}
	}
}
