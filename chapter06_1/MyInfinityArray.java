package chapter06_1;

public class MyInfinityArray {

	private int[] array;
	private int length;
	private int index = 0;
	private boolean tg = false;
	
	public MyInfinityArray(int length) {
		this.length = length;
		array = new int[length];
	}
	
	void put(int value) { // 1.번지수 값이 남아있으면? 2.번지수 값을 넘어가면?
		if(index < length) {
			array[index] = value;
		} else {
			int[] array = new int[length+1];
			array[length] = value;
			for(int i = 0; i < length; i++) {
				array[i] = this.array[i];
			}
			this.array = array;
			this.length = length+1;
		}
		index++;
	}
	
	void remove(int idx) {
		int[] array = new int[length-1];
		this.length = length-1;
		for(int i = 0, j = 0; i < length; i++, j++) {
			if(j != idx) {
				array[i] = this.array[j];
			} else {
				i--;
			}
		}
		this.array = array;
		index--;
	}
	
	void search(int value) {
		for(int i = 0; i < length; i++) {
			if(array[i] == value) {
				tg = true;
			} else {
				tg = false;
			}
		}
		if (tg) {
			System.out.println("해당 배열에 "+value+"이 있습니다.");
		} else {			
			System.out.println("해당 배열에 "+value+"이 없습니다.");
		}
	}
	
	void showInfo() {
		for(int i = 0; i < length; i++) {
			System.out.print(i+"번\t");
		}
		System.out.println();
		for(int i = 0; i < length; i++) {
			System.out.print(array[i]+"\t");			
		}
		System.out.println();
	}
	
}
