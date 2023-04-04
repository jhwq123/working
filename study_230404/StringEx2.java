package study_230404;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "aebcd ef";
		String txt = "cd";

		//indexOf(문자열)
		int result = str.indexOf(txt);
		System.out.println(result);
		System.out.println("---------------------------------");
		
		//lastIndexOf()
		result = str.lastIndexOf('e');
		System.out.println(result);		
		System.out.println("---------------------------------");

		//concat()
		String s1 = "Hello ";
		String s2 = "Java";
		String s3 = s1.concat(s2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("---------------------------------");
		
		//substring()
		String s4 = "abcdefghijklmnopqrstuvwxyz";
		String x = s4.substring(24);
		System.out.println(x);
		x = s4.substring(1, 5);
		System.out.println(x);
		System.out.println("---------------------------------");
		
		//split(구분자)
		String y = "2023-04-09";
		String[] yy = y.split("-"); // 20230403
		String yyy = "";
		for (int i = 0; i < yy.length; i++) {
			yyy += yy[i];
		}
		System.out.println(yyy); //yyy = "20230403"
		String yyyy = "";
//		for (int i = 0; i < yy.length; i++) {
//			yyyy += yy[i];
//			if (i != yy.length-1) {
//				yyyy += "/";
//			} 
//		}
		int leng1 = yy[0].length();
		int leng2 = leng1 + yy[1].length();
		int leng3 = leng2 + yy[2].length();
		yyyy = yyy.substring(0, leng1) + "/" + yyy.substring(leng1, leng2) + "/" + yyy.substring(leng2, leng3);
		System.out.println(yyyy);
		System.out.println("---------------------------------");

		// 문자열1.contains(문자열2)
		String fruits = "appel, apple, banana, peach";
		boolean tf = fruits.contains("");
		if(tf) {
			System.out.println("있습니다.");
		} else {
			System.out.println("없습니다.");
		}
		
		
	}
}