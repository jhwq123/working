package study_230419;

@SuppressWarnings("unchecked")
public class ArrayLT<T> {

	static private int idx = 0;
	private T[] oList;

	ArrayLT() {
		// 타입 배열 생성 할 때부터, T라는 타입으로 생성 후 배열을 만들면 어떨까
		this.oList = (T[]) new Object[1];
	}

	void add(T value) {
		if (idx >= oList.length) { // 배열확장 + 데이터추가
			T[] temp = (T[]) new Object[oList.length + 1];
			for (int i = 0; i < oList.length; i++) {
				temp[i] = oList[i];
			}
			oList = temp;
		}
		try {
			oList[idx] = value;
			idx++;
		} catch (Exception e) {

		}

	}

	T get(int idx_t) {
		return oList[idx_t];
	}

	void print() {
		for (int i = 0; i < oList.length; i++) {
			System.out.println(get(i) + "\t");
		}
	}

}
