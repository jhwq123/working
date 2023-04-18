package study_230418;

public class BallBox<T extends Ball> {

	private T color;

	public T getColor() {
		return color;
	}

	public void setColor(T color) {
		this.color = color;
	}

}
