package inheritance;

public class Circle {

	Point point; //has - a 관계
	
	private int radius; //private은 클래스 내부에서만 접근 허용
	
	public Circle() { //외부 클래스 어디서든 접근 가능
		point = new Point();
	}
}
