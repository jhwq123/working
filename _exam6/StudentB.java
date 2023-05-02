package _exam6;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class StudentB implements Student {

	private int sno;
	private String sname;
	Map<String, Integer> sub = new HashMap<>();

	StudentB() {
		sub.put("htmlScore", 0);
		sub.put("cssScore", 0);
		sub.put("jsScore", 0);
	}

	@Override
	public String getScore() {
		String htmlPass = null;
		if (sub.get("htmlScore") >= 60) {
			htmlPass = "PASS";
		} else {
			htmlPass = "FAIL";
		}
		String cssPass = null;
		if (sub.get("cssScore") >= 60) {
			cssPass = "PASS";
		} else {
			cssPass = "FAIL";
		}
		String jsPass = null;
		if (sub.get("jsScore") >= 60) {
			jsPass = "PASS";
		} else {
			jsPass = "FAIL";
		}

		String result = "번호: " + sno + "\n이름: " + sname + "\njava점수: " + sub.get("htmlScore") + "\t (" + htmlPass
				+ ")\ncss점수: " + sub.get("cssScore") + "\t(" + cssPass + ")\njs점수: " + sub.get("jsScore") + "\t("
				+ jsPass + ")";
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
		return sub.get("htmlScore") + sub.get("cssScore") + sub.get("jsScore");
	}

	@Override
	public double getAvg() {
		return getTotal() / 3.0;
	}
}
