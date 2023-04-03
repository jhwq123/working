 package chapter06_5;

import java.util.Scanner;

public class MemberTest {
	public static void main(String[] args) {
		
		MemberManager ml = new MemberManager(5);
		Scanner scanner = new Scanner(System.in);
		
		Member m1 = new Member(11, "철수", "01011112978");
		Member m2 = new Member(4, "영희", "01022222978");
		Member m3 = new Member(7, "바둑", "01033332978");
		Member m4 = new Member(9, "젬스", "01044442978");
		Member m5 = new Member(3, "찰리", "01055552978");
		m1.setEmail("pao12@yahoo.com");
		m2.setEmail("pao12@daum.net");
		m3.setEmail("pao12@naver.com");
		m4.setEmail("pao12@gmail.com");
		m5.setEmail("pao12@hanmail.net");
		ml.resistMember(m1);
		ml.resistMember(m2);
		ml.resistMember(m3);
		ml.resistMember(m4);
		ml.resistMember(m5);
		
		while(true) {
			System.out.println("작업을 선택하세요");
			System.out.println("< 1:등록 / 2:조회 / 3:수정 / 4.삭제 >");
			int sel = scanner.nextInt();
			switch(sel) {
			case 1: // 연락처 추가 (Create)
				Member mem = new Member(0, "", "");				
				int idx = ml.getIndex();
				System.out.println((idx+1)+"번째 정보를 추가합니다.");

				System.out.println("번호를 입력하세요");
				int mno = scanner.nextInt();
				mem.setMno(mno);

				System.out.println("이름을 입력하세요");
				String title = scanner.next();
				mem.setName(title);

				System.out.println("전화번호를 입력하세요");
				String phone = scanner.next();
				mem.setPhone(phone);

				System.out.println("이메일을 입력하세요");
				String email = scanner.next();
				mem.setEmail(email);
				
				ml.resistMember(mem);
				break;
			case 2: // 연락처 조회 (Read)
				System.out.println("조회 할 작업을 선택하세요");
				System.out.println("< 1. 전체 조회 / 2. 개별 조회 >");
				sel = scanner.nextInt();
				if(sel == 1) {
					Member[] m = ml.selectAll();
					for (int i = 0; i < m.length; i++) {
						System.out.println(m[i].toString());
					}
				} else if (sel == 2) {
					System.out.println("조회 할 번호를 선택하세요");
					sel = scanner.nextInt();
					Member selMember = ml.selectOne(sel);
					if(selMember == null) {
						System.out.println("해당 번호값이 없습니다.");
					} else {
						System.out.println("어떤 정보를 조회할까요?");
						System.out.println("< 1:이름 / 2:전화번호 / 3:이메일 >");
						sel = scanner.nextInt(); 
						switch(sel) {
						case 1:
							System.out.println(selMember.getName());
							break;
						case 2:
							System.out.println(selMember.getPhone());
							break;
						case 3:
							System.out.println(selMember.getEmail());
							break;
						}
					}
				} else {
					
				}
				break;
			case 3: // 연락처 수정 (Update)
				// 수정
				System.out.println("책 번호를 입력하세요");
				int num = scanner.nextInt();
				Member me = ml.selectOne(num);
				
				if(me == null) {
					System.out.println("해당 정보를 찾지 못했습니다.");
				} else {
					System.out.println(me.toString());
					
					System.out.println("해당 연락처의 내용을 수정하겠습니까? (1:예 /2:아니오)");
					sel  = scanner.nextInt();
					
					if (sel == 1) {
						System.out.println("번호를 입력하세요");  // 업데이트시, 번호 중복되면 처리되도록 하기
						mno = scanner.nextInt();
						me.setMno(mno);

						System.out.println("이름을 입력하세요");
						title = scanner.next();
						me.setName(title);

						System.out.println("전화번호를 입력하세요");  // 업데이트시, 번호 중복되면 처리되도록 하기
						phone = scanner.next();
						me.setPhone(phone);

						System.out.println("이메일을 입력하세요");  // 업데이트시, 이메일 중복되면 처리되도록 하기
						email = scanner.next();
						me.setEmail(email);
						
						ml.updateMember(num, me);
					}
				}
				break;
			case 4: // 연락처 삭제 (Delete)
				// 삭제
				break;
			}
		}
	}
}
