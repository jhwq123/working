package study_230403;

public class Human {

	static int cnt;
	static int level = 1;
	int num;
	int lev;
	
	public Human() {
		cnt++;
		num = cnt;
		if(cnt >= 200) {
			level = 3;
		} else if(cnt >= 100) {
			level = 2;
		}
		lev = level;
	}
	
	
	
}
