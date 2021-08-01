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
//		��ü�� ��ȸ�ϴ� �������̽� Iterator
		Iterator<Member> iterator = treeSet.iterator();
		while (iterator.hasNext()) //���� ���� ������ null���� ��ȯ
		{ 
			Member member = iterator.next(); //���� �� ��ȯ
			int tempId = member.getMemberId();
			if (memberId == tempId) 
			{
				treeSet.remove(member); //index�� Object �ΰ��� ��� ����
				return true;
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
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