package study_230420;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Student[] sList = new Student[20];
		int sno = 0, score = 0, idx = 0, idx_t = 0;
		String name = "";

		sList[0] = new Student(1, "민식", 93);
		sList[1] = new Student(4, "만식", 75);
		sList[2] = new Student(3, "몽식", 90);
		sList[3] = new Student(6, "면식", 75);
		sList[4] = new Student(8, "문식", 81);
		idx = 5;
		System.out.println("학생 정보 배열 과제를 시작해유");

		while (true) {
			System.out.println("1.등록 / 2.조회 / 3.수정 / 4.삭제");
			System.out.print("작업을 선택해유>>");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.print("번호를 입력해유>>");
				sno = sc.nextInt();
				for (int i = 0; i < sList.length; i++) {
					if (sList[i].getSno() == sno) {
						System.out.println("해당 번호 학생이 이미 있슈.");
						break;
					}
				}
				System.out.print("이름을 입력해유>>");
				name = sc.nextLine();
				name = sc.nextLine();
				System.out.print("점수를 입력해유>>");
				score = sc.nextInt();
				sList[idx] = new Student(sno, name, score);
				idx++;
				System.out.println("추가가 완료됬어유");
				System.out.println(sList[idx - 1]);
			} else if (sel == 2) {
				// null인 배열 조회를 회피해야합니다
				for (int i = 0; i < sList.length; i++) {
					if (sList[i] == null) {
						break;
					}
					System.out.println(sList[i]);
				}
			} else if (sel == 3) {
				System.out.print("어떤 번호의 학생을 수정할거유?>>");
				sno = sc.nextInt();
				idx_t = -1;
				for (int i = 0; i < idx; i++) {
					if (sList[i].getSno() == sno) {
						idx_t = i;
					}
				}
				if (idx_t == -1) {
					System.out.println("해당번호 학생이 없어유.");
					break;
				}
				System.out.println("이 학생이 맞아유?");
				System.out.println(sList[idx_t]);
				System.out.print("진행해유? (1.네 / 2.아니오)>>");
				sel = sc.nextInt();
				if (sel == 1) {
					System.out.print("점수를 입력해유>>");
					score = sc.nextInt();
					sList[idx_t].setScore(score);
					System.out.println("수정이 완료됬어유");
					System.out.println(sList[idx_t]);
				} else if (sel == 2) {
					System.out.println("시작화면으로 돌아가유");
				} else
					error();

			} else if (sel == 4) {
				System.out.print("어떤 번호의 학생을 삭제할거유?>>");
				sno = sc.nextInt();
				idx_t = -1;
				for (int i = 0; i < idx; i++) {
					if (sList[i].getSno() == sno) {
						idx_t = i;
					}
				}
				if (idx_t == -1) {
					System.out.println("해당번호 학생이 없어유.");
					break;
				}
				System.out.println("이 학생이 맞아유?");
				System.out.println(sList[idx_t]);
				System.out.print("진행해유? (1.네 / 2.아니오)>>");
				sel = sc.nextInt();
				if (sel == 1) {
					// i값과 j값의 시작지점부터 옮기도록 해서, 더 깔끔하게 해주는 방법이 있는 것 같다.
					// 다시 수정해보자.
					for (int i = idx_t, j = (idx_t + 1); i < (sList.length - 1); i++, j++) {
						if (sList[j] == null) {
							break;
						}
						sList[i] = sList[j];
					}
					sList[idx - 1] = null;
					idx--;
					System.out.println("삭제가 완료됬어유");
				} else if (sel == 2) {
					System.out.println("시작화면으로 돌아가유");
				} else
					error();
			} else
				error();
		}
	}

	static void error() {
		System.out.println("올바른 답을 입력하세요.");

	}
}
