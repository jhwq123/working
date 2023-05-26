package study_230509;

public class DateTest {

	public static void main(String[] args) {

//		KHWDate d1 = new KHWDate(2016, 11, 32); // 일 범위초과
//		KHWDate d2 = new KHWDate(2016, 0, 31); // 월 범위초과
//		KHWDate d3 = new KHWDate(0, 0, 31); // 년 범위초과

//		KHWDate d4 = new KHWDate(2023, 5, 9); // 정상
//		d4.calender(); // 캘린더 동작

		KHWDate d5 = new KHWDate(); // 생성자 없이 만들면, 현재 값 데이터에 저장
//		d2.calender(); // 캘린더 동작
//		System.out.println(d5.getFullDate()); // 년, 월, 일 출력
//		System.out.println(d5.getFullDate("*")); // 커스텀 년, 월, 일 출력
//		System.out.println(d5.getFullDate("-"));
//		System.out.println(d5.getFullDate("/"));

		// static getToday로 현재 값 출력 및 0.2초 반복하여 miliSec단위 확인
//		for (int i = 0; i < 10; i++) {
//			try {
//				KHWDate.getToday();
//				Thread.sleep(200);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}

		// 오늘 값 받은것중에, 요일 정보를 받아와 출력
//		String todayMonthEng = (String) KHWDate.getToday("monthEngs");
//		System.out.println(todayMonthEng);

		// 이전일 때
//		System.out.println(d5.getDiffDate(2021, 7, 4)); // 정상
//		System.out.println(d5.getDiffDate(2023, 2, 18)); // (90) -3
//		System.out.println(d5.getDiffDate(2023, 6, 18)); // (30) -1
//		System.out.println(d5.getDiffDate(2023, 5, 4)); // 정상
		// 이후일 때
//		System.out.println(d5.getDiffDate(2025, 5, 18)); // 정상
//		System.out.println(d5.getDiffDate(2023, 8, 18)); // 정상
		System.out.println(d5.getDiffDate(2026, 3, 21)); // 정상

	}

}
