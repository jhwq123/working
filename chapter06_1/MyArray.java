package chapter06_1;

public class MyArray {
	
	private int[] array;
	private int length;
	
	public MyArray(int length) {
		this.length = length;
		array = new int[length];
	}
	
	void setArray(int index, int value) {
		if (index < length && index >= 0) {
			array[index] = value;			
		} else {
			System.out.println("크기를 벗어났어요.");
		}
	}

	int getArray(int index) {
		if (index < length && index >= 0) {
			return array[index];			
		} else {
			System.out.println("크기를 벗어났어요.");
			return -1; // 에러가 났다는 의미로 많이 씀.
		}
	}
	
	void addArray(int value) {
		int[] array = new int[length+1];
		array[length] = value;
		for(int i = 0; i < length; i++) {
			array[i] = this.array[i];
		}
		this.array = array;
		this.length = length+1;
	}
	
	void showArrayInfo() {
		for(int i = 0; i < length; i++) {
			System.out.print(i+"번\t");
		}
		System.out.println();
		for(int i = 0; i < length; i++) {
			System.out.print(getArray(i)+"\t");			
		}
		System.out.println();
	}
	
}
