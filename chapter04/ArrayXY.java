package chapter04;

public class ArrayXY {
	// 배열x에 배열y값 집어넣기

	public static void main(String[] args) {
					
		int [] x = new int [5];
		int [] y = new int [5];
				
		for (int i = 0; i < 5; i++) {
			x[i] = i+1;	
		}		

		// 방법1 >> 주소지가 해당 값을 지정하게되어 같은값으로 움직임
		y = x; 
			
		for (int j = 0; j < 5; j++) {
			// 방법2 >> 독단적인 값을 넘겨주기 때문에 다른값으로 움직임
			// y[j] = x[j];
			System.out.println(x[j]+" "+y[j]);			
		}
	}
}
