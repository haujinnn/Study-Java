package sigleton;

public class Company {
	
	//private 키워드: 외부에서 생성할 수 없음
	private static Company instance = new Company();
	
	private Company() {}
		
	public static Company getInstance() {
		if (instance == null)
			instance = new Company();
		return instance;
	}
}
