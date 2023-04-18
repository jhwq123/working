package study_230418;

// T : Type Parameter(타입 파라미터 = 자료형 매개변수)
public class GenericPrinter<T> {
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

}
