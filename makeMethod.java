package working;

public class makeMethod {

	public static void main(String[] args) {
		re01(3);
		int result = re(4);
		System.out.println(result);
	}

	private static int re01(int n) {
		return n + re02(n - 1);
	}

	private static int re02(int n) {
		return n + re03(n - 1);
	}

	private static int re03(int n) {
		return n;
	}

	private static int re(int n) {
		if (n == 0) {
			return 0;
		}
		return n + re(n - 1);
	}
}
