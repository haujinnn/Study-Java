package inheritance;

public class VIPCustomer extends Customer{

	private double saleRatio;
	private int agentID;
	
	public VIPCustomer() {
		//super(); //super Ű����: �ڽ��� ����Ŭ������ ����Ű�� ������
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
//		System.out.println("VIPCustomer() ȣ��");
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); //super Ű����: �ڽ��� ����Ŭ������ ����Ű�� ������
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
	}
	
	public int calcPrice(int price) {
		bonusPoint +=price * bonusRatio;
		return price - (int)(price*saleRatio); //�������̵�
	}
	
	public int getAgentID() {
		return agentID;
	}
}