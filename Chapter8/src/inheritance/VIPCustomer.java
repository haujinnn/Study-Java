package inheritance;

public class VIPCustomer extends Customer{

	private double saleRatio;
	private int agentID;
	
	public VIPCustomer() {
		//super(); //super 키워드: 자신의 상위클래스를 가리키는 참조자
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
//		System.out.println("VIPCustomer() 호출");
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); //super 키워드: 자신의 상위클래스를 가리키는 참조자
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
	}
	
	public int calcPrice(int price) {
		bonusPoint +=price * bonusRatio;
		return price - (int)(price*saleRatio); //오버라이딩
	}
	
	public int getAgentID() {
		return agentID;
	}
}
