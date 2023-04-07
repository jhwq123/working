package greenClass2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		ClassUI ui = new ClassUI();
		ClassService service = new ClassService();
		Scanner sc = new Scanner(System.in);
		String id, pw;
		
		ui.intro();
		makeManager();
		
		System.out.println("로그인이 필요합니다. 로그인 해주세요");
		System.out.print("아이디를 입력하세요>>");
		id = sc.next();
		System.out.print("비밀번호를 입력하세요>>");
		pw = sc.next();
		service.login(id, pw);
		
		
		
		System.out.println("선생님 정보를 추가할게요");
		HumanVO t = new TeacherVO("문철", 45);
		service.create(t);

		System.out.println("학생1 정보를 추가할게요");
		HumanVO s1 = new StudentVO("규식", 28);
		service.create(s1);
	
		System.out.println("학생2 정보를 추가할게요");
		HumanVO s2 = new StudentVO("민식", 25);
		service.create(s2);
		
		System.out.println("학생3 정보를 추가할게요");
		HumanVO s3 = new StudentVO("만식", 29);
		service.create(s3);
		
		service.read();
		
	}
	
	static void makeManager() {
		ClassService service = new ClassService();
		
		System.out.println("관리자 정보를 추가할게요");
		ManagerVO m = new ManagerVO("철수", 32);
		m.setDepart("실장");
		m.setRank("주임");
		m.setMoney(1200000);
		m.setBonus(500000);
		service.create(m);
	}
}
