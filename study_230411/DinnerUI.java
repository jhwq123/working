package study_230411;

import java.util.Scanner;

public class DinnerUI {

	Scanner sc = new Scanner(System.in);
	DinnerService service = new DinnerService();
	int sel;

	void intro() {
		System.out.println("=======================");
		System.out.println("=   맛집 리뷰 관리_1.0v   =");
		System.out.println("=======================\n\n");
	}

	void mainDinner() {
		System.out.println("\n할 일을 입력하세요.");
		System.out.print("1. 맛집 생성 / 2. 맛집 조회>>");
		sel = sc.nextInt();
		try {
			if (sel == 1) {
				service.createDinner();
			} else if (sel == 2) {
				service.readDinner();
			} else {
				error();
			}
		} catch (Exception e) {
			error();
		}

	}

	void readDinner() {
		System.out.println("\n맛집은 아래와 같습니다.");
		for (DinnerVO d : service.dList) {
			System.out.println(d);
		}
		System.out.println("\n할 일을 입력하세요.");
		System.out.println("1. 리뷰 쓰기 / 2. 별점 남기기");
		sel = sc.nextInt();
		try {
			if (sel == 1) {
				service.createReview();
			} else if (sel == 2) {
				service.createRank();
			} else {
				error();
			}
		} catch (Exception e) {
			error();
		}
	}

	void error() {
		System.out.println("잘못된 입력입니다.");
	}

}
