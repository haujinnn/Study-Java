package abstractex;

public abstract class Computer { //�߻� Ŭ����

	public abstract void display(); //�޼��� ������ ���ϰ� ����
	public abstract void typing();
		
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
