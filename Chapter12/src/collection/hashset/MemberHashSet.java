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
//		��ü�� ��ȸ�ϴ� �������̽� Iterator
		Iterator<Member> iterator = hashSet.iterator();
		while (iterator.hasNext()) //���� ���� ������ null���� ��ȯ
		{ 
			Member member = iterator.next(); //���� �� ��ȯ
			int tempId = member.getMemberId();
			if (memberId == tempId) 
			{
				hashSet.remove(member); //index�� Object �ΰ��� ��� ����
				return true;
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
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
