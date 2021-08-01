package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberArrayList = new MemberHashSet();
		
		Member memberLee = new Member(101, "이순신");
		Member memberKim = new Member(102, "김유신");
		Member memberShin = new Member(103, "신사임당");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberShin);
		
		memberArrayList.showAll();
		
		
		memberArrayList.removeMember(memberKim.getMemberId());
		memberArrayList.showAll();
		
	}

}
