package j_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); //����ȭ, �ڽİ�ü�� �߰��� ����� ����� �� ����. ����Ϸ��� ĳ���� �ؾ���.
		
		set.add("Java");//�ߺ��� Java�� �ѹ��� ����� 
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size(); //����� ��ü �� ���
		System.out.println("�� ��ü�� : " + size);
		
		Iterator<String> iterator = set.iterator(); //�ݺ��� ���
		
		while(iterator.hasNext()) { //��ü ����ŭ ����
			
			String element = iterator.next(); // �� ���� ��ü�� �����´�.
			System.out.println("\t" + element);
		}
		set.remove("Java");//�� ���� ��ü ����
		set.remove("iBATIS");//�� ���� ��ü ����
		
		System.out.println("�� ��ü�� : " + set.size()); //���� �� ���� ������ �ִ� �� ���
		
		iterator = set.iterator(); //�ݺ��� ���
		while(iterator.hasNext()) { //��ü �� ��ŭ ����
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.clear(); //��� ��ü�� �����ϰ� ���
		if(set.isEmpty()) {
			System.out.println("��� ����");
		}
		
		
		Set<MemberVo> memberSet = new HashSet<MemberVo>();
		memberSet.add(new MemberVo("a001", "1111", "hong", "010-1234"));
		memberSet.add(new MemberVo("a002", "1111", "hong", "010-1234"));
		memberSet.add(new MemberVo("a002", "1111", "hong", "010-0000"));
		
		memberSet.add(new MemberVo("a002", "2222", "kim", "010-1234"));
		memberSet.add(new MemberVo("a002", "1111", "hong", "010-0000"));
		
		System.out.println("memberSet size : " + memberSet.size());
		
		Iterator<MemberVo> iter2 = memberSet.iterator();
		while(iter2.hasNext()) {
			MemberVo vo = iter2.next();
			System.out.println(vo);
		}
		
		MemberVo delVo = new MemberVo("a002", "1111", "hong", "010-0000");
		memberSet.remove(delVo);
		
		
		System.out.println("-------------------------");
		for( MemberVo vo : memberSet) {
			System.out.println(vo);
		}

	}

}
