package study_230426;

// 숫자 던셈기능 구현
public class TypeTest {
	public static void main(String[] args) {

		MemberVO member = new MemberVO();
		member.setName("aaa");
		member.setTel("010-1111-1111");

		MemberDao m = new MemberDao();

		System.out.println(m.resist(member));
		System.out.println(m.delete(member));

	}

}
