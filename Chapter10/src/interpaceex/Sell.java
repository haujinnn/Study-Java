package interpaceex;

public interface Sell {
	
	void sell();
	
	default void order() {
		System.out.println("�Ǹ��ֹ�");
	}
}