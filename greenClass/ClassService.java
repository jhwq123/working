package greenClass;

public class ClassService {

	static int login(String id, String pw, HumanVO[] hList) {
		for(int i = 0; i < hList.length; i++) {
			if(id.equals(hList[i].getId()) && pw.equals(hList[i].getPw())) {
				return i;
			}
		}
		return -1;
	}
	
	HumanVO create(HumanVO h) {
		return h.createHuman();
	}
	
	void read(HumanVO h) {
		System.out.println(h.readHuman());
		
	}
	
	void update() {
		;//언젠가
	}
	
	void delete() {
		;//언젠가
	}
	
	void error() {
		System.out.println("잘못 입력하셨습니다. 처음부터 다시 시도하세요.");
	}
}
