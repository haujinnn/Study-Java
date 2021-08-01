package collection.treeset;

import java.util.TreeSet;
import java.util.Iterator;

import collection.Member;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member());
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
//		개체를 순회하는 인터페이스 Iterator
		Iterator<Member> iterator = treeSet.iterator();
		while (iterator.hasNext()) //다음 값이 없으면 null값을 반환
		{ 
			Member member = iterator.next(); //다음 값 반환
			int tempId = member.getMemberId();
			if (memberId == tempId) 
			{
				treeSet.remove(member); //index랑 Object 두가지 사용 가능
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		for (Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println("");
//		System.out.println(arrayList);
	}
}
