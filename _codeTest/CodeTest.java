package _codeTest;

public class CodeTest {
	public static void main(String[] args) {
		int[] answer = {};
        
		int n = 10;

        for(int i = 0; i*2+1 <= n; i++) {
            answer[i] = i*2+1;
        }

		System.out.println(answer);
	}
}
