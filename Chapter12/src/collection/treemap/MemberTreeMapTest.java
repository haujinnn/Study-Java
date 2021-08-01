package collection.treemap;

import collection.Member;
import collection.hashmap.MemberHashMap;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memberLee = new Member(102, "이순신");
		Member memberKim = new Member(101, "김유신");
		Member memberShin = new Member(103, "신사임당");
		
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberShin);
		
//		memberTreeMap.showAllMember();
		
//		memberTreeMap.removeMember(102);
		memberTreeMap.showAllMember(); //정렬되어 출력된다. comparable이 이미 구현되어 있기 때문
	}

}
