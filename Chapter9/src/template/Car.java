package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public final void run() { //final 메서드. 시나리오가 변하면 안됨. 재정의(override) 할 수 없다.
		startCar();
		drive();
		stop();
		turnOff();
	}
}
