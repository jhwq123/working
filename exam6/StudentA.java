package exam6;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class StudentA implements Student {
	private int sno;
	private String sname;
	Map<String, Integer> sub = new HashMap<>();

	StudentA() {
		sub.put("javaScore", 0);
		sub.put("sqlScore", 0);
	}

	@Override
	public String getScore() {
		String javaPass = null;
		if (sub.get("javaScore") >= 60) {
			javaPass = "PASS";
		} else {
			javaPass = "FAIL";
		}
		String sqlPass = null;
		if (sub.get("sqlScore") >= 60) {
			sqlPass = "PASS";
		} else {
			sqlPass = "FAIL";
		}

		String result = "번호: " + sno + "\n이름: " + sname + "\njava점수: " + sub.get("javaScore") + "\t (" + javaPass
				+ ")\nSQL점수: " + sub.get("sqlScore") + "\t(" + sqlPass + ")";
		return result;
	};

	@Override
	public String getPass() {
		// Map 내부 value 값들을 불러와서 60보다 큰지 계산
		for (String key : sub.keySet()) {
			int value = sub.get(key);
			if (value < 60) {
				return "미수료";
			}
		}
		return "수료";
	};

	@Override
	public int getTotal() {
		return sub.get("javaScore") + sub.get("sqlScore");
	}

	@Override
	public double getAvg() {
		return getTotal() / 2.0;
	}
}
