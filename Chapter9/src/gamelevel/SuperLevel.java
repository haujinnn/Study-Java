package gamelevel;

public class SuperLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("��û ���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("��û ���� ����");
	}

	@Override
	public void turn() {
		System.out.println("�ѹ��� ��");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****����� �����Դϴ�.****");
	}
}
