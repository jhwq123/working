package study_230411;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileTest {
	public static void main(String[] args) {
		File f = new File("obj.dat");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		Student s1 = new Student();
		s1.setName("민식이");
		s1.setAge(33);

		Student s2 = new Student();
		s2.setName("홍길동");
		s2.setAge(60);

		Student s3 = new Student();
		s3.setName("아이유");
		s3.setAge(80);

		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);

		try {
			fos = new FileOutputStream(f);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.close();

			fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);

			@SuppressWarnings("unchecked")
			List<Student> slist = (List<Student>) ois.readObject();

			for (Student stu : slist) {
				System.out.println(stu);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println("무조껀 실행되는 코드다.");
		}
	}
}
