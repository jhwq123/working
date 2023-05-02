package _exam6;

public interface AcademyService {

	String id = "";
	String pw = "";

	abstract int login(String id, String pw);

	abstract void insert();

	abstract void select(int sno);

	abstract void selectAll();
}
