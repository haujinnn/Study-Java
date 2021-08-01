package collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member>{

	private int memberId;
	private String memberName;
	

	public Member() {} //default constructor
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public int compareTo(Member member) {
		return (this.memberName.compareTo(member.memberName)); //이름순
	}

	@Override
	public int compare(Member member1, Member member2) { //Comparator의 메서드
		return (member1.memberId - member2.memberId);
	}
}
