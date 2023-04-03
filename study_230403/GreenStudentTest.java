package study_230403;

public class GreenStudentTest {
	public static void main(String[] args) {
		
		GreenStudent[] gList = new GreenStudent[10];
		
		GreenStudent g_1 = new GreenStudent("민준", 'A');
		GreenStudent g_2 = new GreenStudent("서준", 'B');
		GreenStudent g_3 = new GreenStudent("도윤", 'B');
		GreenStudent g_4 = new GreenStudent("예준", 'A');
		GreenStudent g_5 = new GreenStudent("시우", 'C');
		GreenStudent g_6 = new GreenStudent("하준", 'A');
		GreenStudent g_7 = new GreenStudent("주원", 'C');
		GreenStudent g_8 = new GreenStudent("지호", 'B');
		GreenStudent g_9 = new GreenStudent("지후", 'B');
		GreenStudent g_10 = new GreenStudent("준우", 'B');
		
		gList[0] = g_1;
		gList[1] = g_2;
		gList[2] = g_3;
		gList[3] = g_4;
		gList[4] = g_5;
		gList[5] = g_6;
		gList[6] = g_7;
		gList[7] = g_8;
		gList[8] = g_9;
		gList[9] = g_10;
		
		GreenStudent.printClass('A');
		GreenStudent.printClass('B');
		GreenStudent.printClass('C');
		GreenStudent.printAll();
	}
}
