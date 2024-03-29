package study_230509;

import java.util.Scanner;

import lombok.Data;

@Data
public class KHWDate {

	// 1. 날짜 기준 부합 데이터
	// 2. 날짜간 연산
	// 3. 날짜 리턴해줄때 2023-05-09 로 주던
	// 2023.05.09로 주던, 2023/05/09로 주던 마음대로
	// 유효한 데이터만 저장할 수 있도록 하는 1차 목표 만들기.
	private int myYear;
	private int myMonth;
	private int myDay;
	private static int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static String[] monthEngs = { "January", "February", "March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December" };
	private static String[] weekEngs = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

	public KHWDate() {
		getToday();
		myYear = (int) getToday("year");
		myMonth = (int) getToday("month");
		myDay = (int) getToday("day");
	}

	public KHWDate(int myYear, int myMonth, int myDay) {
		this.myYear = myYear;
		this.myMonth = myMonth;
		this.myDay = myDay;
		calcDate(myYear, myMonth, myDay);
	}

	// public method

	public long getDiffDate(int year, int month, int day) { // 날짜간 차이 구하기 (현재 날짜와의 차이를 일수로 나타내기)
		long result = -1;
		int fYear = 0, fMonth = 0, fDay = 0, pYear = 0, pMonth = 0, pDay = 0;
		int tempYear, tempMonth, tempDay;

		// 받은 연, 월, 일 값이 맞는지 확인
		if (calcDate(year, month, day)) {
			// 1. 미래 연도날짜와 과거 연도날짜를 구함
			if (myYear >= year) {
				fYear = myYear;
				fMonth = myMonth;
				fDay = myDay;
				pYear = year;
				pMonth = month;
				pDay = day;
			} else if (myYear < year) {
				fYear = year;
				fMonth = month;
				fDay = day;
				pYear = myYear;
				pMonth = myMonth;
				pDay = myDay;
				result += 1;
			}

			if (fYear == pYear && fMonth == pMonth && fDay == pDay) {
				System.out.println("두 날짜의 일수가 같습니다.");
				result = 0;
			}

			result++;

			tempYear = pYear;
			tempMonth = pMonth;
			tempDay = months[tempMonth - 1] - pDay;
			if (tempMonth == 2) {
				if ((tempYear % 4 == 0 && !(tempYear % 100 == 0)) || year % 400 == 0) {
					tempDay++;
				}
			}
			tempMonth++;

			// 달 차이가 안나면 구하는 식을 추가로 넣어줘야 함.
			if (fYear == pYear && fMonth == pMonth) {
				return fDay - pDay;
			}

			// 2. 과거 연도날짜부터 시작해서 미래 연도날짜까지 일수를 더해가면서 판별함
			// 원하는 연도에 도달할때까지 반복
			while (tempYear < fYear || tempMonth < fMonth) {
				// 2월에는 현재 tempYear이용한 윤달 검증
				if (tempMonth == 2) {
					if ((tempYear % 4 == 0 && !(tempYear % 100 == 0)) || year % 400 == 0) {
						result++;
					}
				}
				result += months[tempMonth - 1];
				tempMonth++;
				// 12월 도달 시 연도 1 추가 카운트
				if (tempMonth == 13) {
					tempYear++;
					tempMonth = 1;
				}
			}
			// 3. 미래 연도날짜까지 도달 후 카운트된 일수를 반환함
			// 남은 일수 추가로 더해주기
			result += fDay + tempDay;

		}
		return result;

	}

	public String getFullDate() {
		String monthTemp = "";
		String dayTemp = "";
		if (myMonth < 10) {
			monthTemp = "0";
		}
		if (myDay < 10) {
			dayTemp = "0";
		}
		return myYear + monthTemp + myMonth + dayTemp + myDay + "";
	}

	public String getFullDate(String mark) {
		String monthTemp = "";
		String dayTemp = "";
		if (myMonth < 10) {
			monthTemp = "0";
		}
		if (myDay < 10) {
			dayTemp = "0";
		}
		return myYear + mark + monthTemp + myMonth + mark + dayTemp + myDay + "";
	}

	public static void getToday() {
		// 2월은 계속 28일인데, 4년주기 29일됨
		// 2월 끝 두자리가 4의 배수인 해는 무조껀 윤년임.
		// 2월 끝 두자리가 00인 해는 예외적 평년이다.
		// 2월 끝 두자리가 00인 해 중에서도 그 윗자리가 4의 배수면 다시 윤년이다.
		// 윤년의 조건은 (4의 배수인 해 and 100의 배수가 아닌 해) or 400의 배수인 해 이다.

		// 1970년 1월 1일 00:00:00 이후 경과된 시간을 long타입 밀리세컨드 반환임.
		long l = System.currentTimeMillis();
		// 목표 값
		// Date d = new Date(l);
		// System.out.println(d);
		// *1000 (sec), *60 (min), *60 (hour), *24 (day),
		// 복잡한날짜연산(month), 해수 카운트(year), 요일 연산(week)

		long newSec = l / 1000;
		long secTemp = l % 1000;
		// 초의 남은 밀리세컨드
		double nowMiliSec = secTemp / 1000.000;

		long newMin = newSec / 60;
		long minTemp = newSec % 60;
		// 분의 남은 초
		int nowSec = (int) minTemp;

		long newHour = newMin / 60;
		long hourTemp = newMin % 60;
		// 시간의 남은 분
		int nowMin = (int) hourTemp;

		int newDay = (int) newHour / 24;
		// 일의 남은 시간
		int nowHour = (int) newHour % 24;
		nowHour += 9;

		// 연도 구하기
		int yearTemp = 1970;
		while (newDay - findTwoMonth(yearTemp) > 0) {
			newDay -= findTwoMonth(yearTemp);
			yearTemp++;
		}
		int nowYear = yearTemp;

		// 월 구하기
		int nowMonth = 0;
		while (newDay > 0) {
			if (newDay - months[nowMonth] < 0) {
				nowMonth++;
				break;
			}
			newDay -= months[nowMonth];
			nowMonth++;
		}

		// 일 구하기
		int nowDay = newDay + 1;

		// 요일 구하기
		String nowWeek = weekEngs[getWeek(nowYear, nowMonth, nowDay)];

		// 결과 값 모사하기 nowWeek, nowYear, nowMonth, nowDay,
		// nowHour, nowMin, nowSec, nowMiliSec
		System.out.print(nowWeek + "");
		System.out.print(monthEngs[nowMonth - 1] + "");
		if (nowDay < 10) {
			System.out.print("0");
		}
		System.out.print(nowDay + "");
		System.out.print(nowHour + ":" + nowMin + ":" + (double) (nowSec + nowMiliSec) + "");
		System.out.println("KST " + nowYear);

	}

	public static Object getToday(String sel) {
		long l = System.currentTimeMillis();

		long newSec = l / 1000;
		long secTemp = l % 1000;
		double nowMiliSec = secTemp / 1000.000;

		long newMin = newSec / 60;
		long minTemp = newSec % 60;
		int nowSec = (int) minTemp;

		long newHour = newMin / 60;
		long hourTemp = newMin % 60;
		int nowMin = (int) hourTemp;

		int newDay = (int) newHour / 24;

		int nowHour = (int) newHour % 24;
		nowHour += 9;

		int yearTemp = 1970;
		while (newDay - findTwoMonth(yearTemp) > 0) {
			newDay -= findTwoMonth(yearTemp);
			yearTemp++;
		}
		int nowYear = yearTemp;

		int nowMonth = 0;
		while (newDay > 0) {
			if (newDay - months[nowMonth] < 0) {
				nowMonth++;
				break;
			}
			newDay -= months[nowMonth];
			nowMonth++;
		}

		int nowDay = newDay + 1;

		String nowWeek = weekEngs[getWeek(nowYear, nowMonth, nowDay)];

		if (sel.equals("week")) {
			return nowWeek;
		} else if (sel.equals("year")) {
			return nowYear;
		} else if (sel.equals("month")) {
			return nowMonth;
		} else if (sel.equals("monthEngs")) {
			return monthEngs[nowMonth - 1];
		} else if (sel.equals("day")) {
			return nowDay;
		} else if (sel.equals("hour")) {
			return nowHour;
		} else if (sel.equals("minute")) {
			return nowMin;
		} else if (sel.equals("second")) {
			return nowSec;
		} else if (sel.equals("miliSecond")) {
			return nowMiliSec;
		} else {
			return "";
		}

	}

	public void calender() {
		Scanner sc = new Scanner(System.in);
		int year = myYear;
		int month = myMonth;

		int sel = 1;
		while (sel > 0) {
			// 일수 구하기
			int tempMonth = 0;
			if (myMonth == 2) {
				// 2일때의 윤년값
				if (findTwoMonth(year) == 365) {
					// 윤년아님 28일
					tempMonth = 28;
				} else if (findTwoMonth(year) == 366) {
					// 윤년임 29일
					tempMonth = 29;
				}
			} else {
				// 그외의 값
				tempMonth = months[month - 1];
			}

			int tempCnt = 1;
			int tempDay = 1;
			// 시작 요일 구하기
			int tempWeek = getWeek(year, month, tempDay);
			if (tempWeek == 0) {
				tempWeek = 6;
			} else {
				tempWeek--;
			}

			// week부터 나온 해수부터 시작해서 채워넣기
			// 0 = 토욜(6) / 1 = 일욜(0) / 2 = 월욜(1) / 3 = 화욜(2)

			int[] tempDays = new int[42];
			// 초기화
			for (int i = 0; i < 42; i++) {
				tempDays[i] = 0;
			}

			// 값 채우기
			for (int i = tempWeek; i < tempMonth + tempWeek; i++) {
				tempDays[i] = tempCnt;
				tempCnt++;
			}
			tempCnt = 0;
			calenderUI(year, month, tempDays);

			System.out.println("원하는 동작을 선택하세요.");
			System.out.print("1.이전달 / 2.다음달 / 0.중지 >>");
			sel = sc.nextInt();
			if (sel == 1) {
				// 이전달? month-1
				if (month - 1 < 1) {
					year--;
					month = 12;
				} else {
					month--;
				}
			} else if (sel == 2) {
				// 다음달? month+1
				if (month + 1 > 12) {
					year++;
					month = 1;
				} else {
					month++;
				}
			} else {
				// 멈춰라~
				sel = 0;
			}
		}
		sc.close();

	}

	public static void calender(int year, int month, int day) {
		Scanner sc = new Scanner(System.in);

		int sel = 1;
		while (sel > 0) {
			// 일수 구하기
			int tempMonth = 0;
			if (month == 2) {
				// 2일때의 윤년값
				if (findTwoMonth(year) == 365) {
					// 윤년아님 28일
					tempMonth = 28;
				} else if (findTwoMonth(year) == 366) {
					// 윤년임 29일
					tempMonth = 29;
				}
			} else {
				// 그외의 값
				tempMonth = months[month - 1];
			}

			int tempCnt = 1;
			int tempDay = 1;
			// 시작 요일 구하기
			int tempWeek = getWeek(year, month, tempDay);
			if (tempWeek == 0) {
				tempWeek = 6;
			} else {
				tempWeek--;
			}

			// week부터 나온 해수부터 시작해서 채워넣기
			// 0 = 토욜(6) / 1 = 일욜(0) / 2 = 월욜(1) / 3 = 화욜(2)

			int[] tempDays = new int[42];
			// 초기화
			for (int i = 0; i < 42; i++) {
				tempDays[i] = 0;
			}

			// 값 채우기
			for (int i = tempWeek; i < tempMonth + tempWeek; i++) {
				tempDays[i] = tempCnt;
				tempCnt++;
			}
			tempCnt = 0;
			calenderUI(year, month, tempDays);

			System.out.println("원하는 동작을 선택하세요.");
			System.out.print("1.이전달 / 2.다음달 / 0.중지 >>");
			sel = sc.nextInt();
			if (sel == 1) {
				// 이전달? month-1
				if (month - 1 < 1) {
					year--;
					month = 12;
				} else {
					month--;
				}
			} else if (sel == 2) {
				// 다음달? month+1
				if (month + 1 > 12) {
					year++;
					month = 1;
				} else {
					month++;
				}
			} else {
				// 멈춰라~
				sel = 0;
			}
		}
		sc.close();

	}

	// private

	private boolean calcDate(int myYear, int myMonth, int myDay) {
		boolean pass = true;
		// year
		if (myYear < 1) {
			System.err.println("연도 범위 초과.");
			pass = false;
		} else {
			// month
			if (myMonth < 1 || myMonth > 12) {
				System.err.println("월 범위 초과.");
				pass = false;
			} else {
				// day
				int temp = 0;
				if (myMonth > 0) {
					if (myMonth == 2) {
						temp = findTwoMonth(myYear);
						if (temp == 365) {
							temp = 28;
						} else {
							temp = 29;
						}
					} else {
						temp = months[myMonth - 1];
					}
				}
				if (myDay < 1 || myDay > temp) {
					System.err.println("일 범위 초과.");
					pass = false;
				}
			}
		}
		return pass;
	}

	private static int getWeek(int year, int month, int day) {
		// 첼러의 공식을 참고하였습니다.
		// 1월과 2월에서 계산 오류가 나므로, month에 따라 year와 함께 좀 건드려줘야함.
		if (month <= 2) {
			year--;
			month += 12;
		}
		double sol1 = day;
		double sol2 = (month + 1) * 26 / 10;
		if (sol2 < 0) {
			sol2 *= -1;
		}
		double sol3 = year % 100;
		double sol4 = sol3 / 4;
		if (sol4 < 0) {
			sol4 *= -1;
		}
		double sol5 = (year / 100) / 4;
		if (sol5 < 0) {
			sol5 *= -1;
		}
		double sol6 = (year / 100) * 2;
		int sol7 = (int) (sol1 + sol2 + sol3 + sol4 + sol5 - sol6);
		int result = sol7 % 7;

		return result;

	}

	private static void calenderUI(int year, int month, int[] days) {
		System.out.println("┌───────────────────────────┐");
		System.out.println("│        " + year + "년 " + month + "월	    │");
		System.out.println("├───┬───┬───┬───┬───┬───┬───┤");
		System.out.println("│ S │ M │ T │ W │ T │ F │ S │");
		System.out.println("├───┼───┼───┼───┼───┼───┼───┤");

		System.out.print("│ ");
		for (int i = 0; i < 42; i++) {
			if (days[i] != 0) {
				System.out.print(days[i]);
				if (days[i] < 10) {
					System.out.print("");
				}
				System.out.print("│ ");
			} else {
				System.out.print("  │ ");
			}
			if ((i + 1) % 7 == 0) {
				System.out.println();
				// 끝
				if ((i + 1) != 42) {
					System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
					System.out.print("│ ");
				} else {
					System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
				}
			}
		}
	}

	private static int findTwoMonth(int year) {
		int temp = 365;
		if ((year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0) {
			temp++;
		}
		return temp;
	}

	void test() {
		int n = 2050;

	}
}
