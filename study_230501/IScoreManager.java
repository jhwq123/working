package study_230501;

public interface IScoreManager {

	public void regist(StudentVO student);

	public int getTotal(StudentVO student);

	public double getAvg(int total, int length);

	public String passOrFail(StudentVO student);
}
