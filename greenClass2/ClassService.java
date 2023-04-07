package greenClass2;

import java.util.ArrayList;

public class ClassService {

	ArrayList<HumanVO> hList = new ArrayList<HumanVO>();

	int login(String id, String pw) {
		for(int i = 0; i < hList.size(); i++) {
			if(hList.get(i).getId().equals(id) && hList.get(i).getPw().equals(pw)) {
				return hList.get(i).getType();
			}
		}
		return -1;
	}
	
	void loop(int type) {
		if (type == 0) {
			// 관리자는 
		} else if (type == 1) {
			// 선생님은 학생 전체, 개별 읽기가능
		} else if (type == 2) {
			// 학생은 권한이 없습니다.
		} else {
			// 누구세요
		}
	}
	
	void create(HumanVO h) {
		hList.add(h);
	}
	
	void read() {
		for (int i = 0; i < hList.size(); i++) {
			System.out.println(hList.get(i).toString());			
		}
	}
	
	void update(HumanVO h) {
//		hList.set(0, h);
	}
	
	void delete(HumanVO h) {
//		hList.remove(0);
	}
	
	
}
