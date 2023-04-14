package _studyFin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalcTest {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\GGG\\Desktop\\calcLog.dat");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		char c;
		String result;
		ArrayList<Calc> log = new ArrayList<>();

		Calc.intro();

		System.out.print("n1>>");
		n1 = sc.nextInt();
		System.out.print("n2>>");
		n2 = sc.nextInt();
		Calc cal = new Calc(n1, n2);

		System.out.print("Oper>>");
		c = sc.next().charAt(0);
		cal.setC(c);

		result = cal.oper(c);
		cal.setResult(result);

		log.add(cal);

		Calc cal2 = new Calc(6, 7);
		cal2.setC('*');
		result = cal2.oper('*');
		cal2.setResult(result);
		log.add(cal2);

		Calc cal3 = new Calc(6, 7);
		cal3.setC('-');
		result = cal3.oper('-');
		cal3.setResult(result);
		log.add(cal3);

		try {
			fos = new FileOutputStream(f);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(log);
			oos.close();

			fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);

			@SuppressWarnings("unchecked")
			List<Calc> logs = (List<Calc>) ois.readObject();

			for (Calc l : logs) {
				System.out.println(l);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력 오류가 생겻습니다.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
			e.printStackTrace();
		}

		sc.close();
	}
}
