package staticex;

public class Student {
	private static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}
	
	public static int getSerialNum() {
		int i = 10;
		i++;
		System.out.println(i);
		//studentName = '하유진'; //멤버 변수
		return serialNum;
	}
}
