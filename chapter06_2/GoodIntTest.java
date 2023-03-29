package chapter06_2;

public class GoodIntTest {
	public static void main(String[] args) {
		
		GoodInt n = new GoodInt(3);
		System.out.println(n.positive());
		System.out.println(n.odd());
		
		System.out.println();
		
		GoodInt a = new GoodInt(8);
		System.out.println(a.positive());
		System.out.println(a.odd());

		System.out.println();

		GoodInt b = new GoodInt(0);
		System.out.println(b.positive());
		System.out.println(b.odd());
	}
}
