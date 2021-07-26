package abstractex;

public abstract class Computer { //추상 클래스

	public abstract void display(); //메서드 구현은 안하고 선언만
	public abstract void typing();
		
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
