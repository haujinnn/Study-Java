package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {

	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
//		for(int i=0; i<hashSet.size();i++) {
//			Member member = hashSet.get(i);
//			int tempId = member.getMemberId();
//			if(memberId == tempId) {
//				hashSet.remove(i);
//				return true;
//			}
//		}
//		개체를 순회하는 인터페이스 Iterator
		Iterator<Member> iterator = hashSet.iterator();
		while (iterator.hasNext()) //다음 값이 없으면 null값을 반환
		{ 
			Member member = iterator.next(); //다음 값 반환
			int tempId = member.getMemberId();
			if (memberId == tempId) 
			{
				hashSet.remove(member); //index랑 Object 두가지 사용 가능
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		for (Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println("");
//		System.out.println(arrayList);
	}
}
