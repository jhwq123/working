package study_230410;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class SecretNoteTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] buff = new char[30];
		int sel;
		boolean flag = true;
		FileWriter fw = null;
		FileReader fr = null;
		String sLine = "";
		String str = "";
		System.out.println("=====================");
		System.out.println("===   일기장_1.0v   ===");
		System.out.println("=====================\n");
		
		System.out.println("할 일을 선택하세요.");
		System.out.print("1.쓰기 / 2.읽기>>");
		sel = sc.nextInt();
		if (sel == 1) { // 쓰기
			// 날짜가 같은 파일이 이미 있는지?
			if (fileReader(fr, buff)) {
				System.out.println("오늘 쓴 일기가 있습니다. 이어쓰시겠습니까?");
				System.out.println("1.이어쓰기 / 2.새로쓰기>>");
				sel = sc.nextInt();
				if (sel == 1) {
					
					for(int i = 0; i < buff.length; i++) {
						sLine += buff[i];
					}
				} else if (sel == 2) {
					sLine = "";
				} else {
					error();
				}
			} else {
				System.out.println("새로운 일기를 씁니다.");
			}
			
			System.out.println("==== 일기 =====");
			System.out.println("=마지막은'끝'하기=");
			System.out.println("=============");
			str = sc.nextLine();
			while(flag) {
				str = sc.nextLine();
				if (str.charAt(str.length()-1) == '끝') {
					flag = false;
				}
				sLine += "\n"+str;
			}
			fileWriter(fw, sLine);
		} else if (sel == 2) { // 읽기
			fileReader(fr, buff);
		} else {
			error();
		}
		sc.close();
	} 
	
	static String getName() {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		return sdf.format(today);
	}
	
	static void error() {
		System.out.println("잘못된 명령입니다.");
	}
	
	static void fileWriter(FileWriter fw, String s) {
		try {
			fw = new FileWriter("C:\\Users\\GGG\\Desktop\\diary"+getName()+".txt");
			fw.write(s);
			fw.close();
			System.out.println("==일기가 저장되었습니다.==");
		} catch (IOException e) {
			System.out.println("오류가 발생했습니다.");
			e.printStackTrace();
		}
	}
	
	static boolean fileReader(FileReader fr, char[] buff) {
		boolean flag = true;
		try {
			fr = new FileReader("C:\\Users\\GGG\\Desktop\\diary"+getName()+".txt");
			fr.read(buff);
			for(int i = 0; i < buff.length; i++) {
				System.out.print(buff[i]);
			}
			System.out.println("");
			flag = true;
		} catch (FileNotFoundException e) {
			System.out.println("일기가 없는 것 같습니다.");
			flag = false;
//			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("오류가 발생했습니다.");
			flag = false;
//			e.printStackTrace();
		}
		return flag;
	}
	
	
}
