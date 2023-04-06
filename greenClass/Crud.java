package greenClass;

public class Crud {

	static int login(String id, String pw, Human[] hList) {
		for(int i = 0; i < hList.length; i++) {
			if(id.equals(hList[i].getId()) && pw.equals(hList[i].getPw())) {
				return i;
			}
		}
		return -1;
	}
	
	static Human create(Human h) {
		return h.createHuman();
	}
	
	static void read(Human h) {
		System.out.println(h.readHuman());
		
	}
	
	static void update() {
		;//언젠가
	}
	
	static void delete() {
		;//언젠가
	}
	
	static void error() {
		System.out.println("잘못 입력하셨습니다. 처음부터 다시 시도하세요.");
	}
}
