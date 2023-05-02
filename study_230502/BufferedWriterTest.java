package study_230502;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

public class BufferedWriterTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("a.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("out.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			// 버퍼에서 파일을 라인단위로 읽는다.
			String line = br.readLine();
			while (line != null) {
				// 읽은 라인을 공백 기준으로 토큰으로 구분하는 객체를 생성한다.
				// line : 우리는 자바 언어를 학습합니다.
				// st : ["우리는", "자바", "언어를", "학습합니다."]
				StringTokenizer st = new StringTokenizer(line, " ");
				while (st.hasMoreTokens()) {
					// 읽을 라인 내에 '자바'라는 단어가 있으면 출력 버퍼에 기록,
					// 버퍼의 내용을 파일에 기록한다.
					if (st.nextToken().equals("자바")) {
						bw.write(line);
						bw.flush();
						bw.newLine();
						break;
					}
				}
				line = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
