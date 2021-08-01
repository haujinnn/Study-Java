package generics;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>(); //������ Ÿ��(class) ����
		printer.setMaterial(new Powder());
		Powder powder = printer.getMaterial(); //down casting
		System.out.println(printer);
		
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<Plastic>(); //������ Ÿ��(class) ����
		printer2.setMaterial(new Plastic());
		Plastic plastic = printer2.getMaterial(); //down casting
		System.out.println(printer2);
		
		printer2.printing();
	}
}
