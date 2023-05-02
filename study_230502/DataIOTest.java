package study_230502;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// 데이터를 입출력할 때 int, float와 같은 자바의 기본 데이터형 유지하면서 입출력 가능.
// 파일에 기록될 때는 이진 데이터로 기록되기 때문에 파일을 열어봐도 알 수 없는 문자가
// 표시되나, 기본형으로 데이터를 다룰 수 있다는 점이 특징이다.
// 네트워크 프로그래밍에서 사용된다.
public class DataIOTest {
	public static void main(String[] args) {
		File file = new File("temp.txt");

		try {
			FileOutputStream fos = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fos);

			// 데이터의 기본형을 유지하면서 파일에 데이터가 기록된다.
			dos.writeBoolean(true);
			dos.writeChar('j');
			dos.writeInt(1234);
			dos.writeFloat(3.14F);
			dos.writeDouble(123.5423);
			dos.writeUTF("java");

			// temp.txt 파일을 입력 파일로 가지는
			// dis 객체를 생성한다.
			FileInputStream fis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis);

			// 데이터의 기본형을 유지하면서 파일에서 데이터를 읽어 출력한다.
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());

			dos.close();
			dis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
