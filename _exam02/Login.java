package _exam02;

public class Login {

	private static String idAdmin = "admin";
	private static String pwAdmin = "1234";
	
	
	static int loginCheck(Student[] sList, String idPri, String pwPri) {
	
		if (idPri.equals(idAdmin) && pwPri.equals(pwAdmin)) {
			// 관리자 로그인 실행
			return -1;
		} else {
			for (int i = 0; i < sList.length; i++) {
				if (idPri.equals(sList[i].getId()) && pwPri.equals(sList[i].getPw())) {
					// 학생 로그인 실행
					return i;
				}
			}
			// 로그인 실패
			return -2;
		}
	}
	
	static void addAccount(Student s, String idPri, String pwPri) {
		s.setId(idPri);
		s.setPw(pwPri);
	}
}
