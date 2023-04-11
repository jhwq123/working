package study_230411;

import java.util.ArrayList;
import java.util.Scanner;

public class DinnerService {

	Scanner sc = new Scanner(System.in);
	DinnerUI ui = new DinnerUI();
	int sel, rank;
	String name, review;
	ArrayList<DinnerVO> dList = new ArrayList<>();

	void mainDinner() {
		ui.intro();
		ui.mainDinner();

	}

	void readDinner() {
		System.out.println("\n맛집은 아래와 같습니다.");
		for (DinnerVO d : dList) {
			System.out.println(d);
		}
		System.out.println("\n할 일을 입력하세요.");
		System.out.println("1. 리뷰 쓰기 / 2. 별점 남기기");
		sel = sc.nextInt();
		try {
			if (sel == 1) {
				createReview();
			} else if (sel == 2) {
				createRank();
			} else {
				ui.error();
			}
		} catch (Exception e) {
			ui.error();
		}
	}

	void createDinner() {
		DinnerVO d = new DinnerVO();
		System.out.print("\n가게 이름을 입력하세요.>>");
		name = sc.nextLine();
		name = sc.nextLine();
		d.setName(name);
		System.out.print("간단한 리뷰를 써주세요.>>");
		review = sc.nextLine();
		d.setReview(review);
		System.out.println("별점을 남겨주세요.(1~5)>>");
		rank = sc.nextInt();
		d.setRank(rank);
		dList.add(d);
		System.out.println("생성이 완료되었습니다.");
		System.out.println(d.toString());
	}

	void createReview() {
		System.out.println("\n가게 이름을 입력하세요.");
		name = sc.nextLine();
		name = sc.nextLine();
		// 가게 조회 및 입장
		System.out.println("현재 리뷰 상태입니다.");
		// 리뷰 리스트 공개
		System.out.print("리뷰를 써주세요.>>");
		// 리뷰 작성 및 추가
		System.out.println("완료되었습니다.");
	}

	void createRank() {
		System.out.println("\n가게 이름을 입력하세요.");
		// 가게 조회 및 입장
		System.out.println("현재 별점 점수입니다.");
		// 별점 점수 공개
		System.out.print("별점을 남겨주세요.(1~5)>>");
		// 별점 작성 및 추가
		System.out.println("완료되었습니다.");
	}

	private static void readReview() {

	}

	private static void update() {
		// 수정
	}

	private static void delete() {
		// 삭제
	}

}
