package study_230418;

public class ZenericEx2 {

	public static void main(String[] args) {

		GenericPrinter<Plastic> printer = new GenericPrinter<>();

		printer.setMaterial(new Plastic());
		Plastic x = printer.getMaterial();
		System.out.println(x);

		GenericPrinter<Powder> printer2 = new GenericPrinter<>();

		printer2.setMaterial(new Powder());
		Powder y = printer2.getMaterial();
		System.out.println(y);
	}
}
