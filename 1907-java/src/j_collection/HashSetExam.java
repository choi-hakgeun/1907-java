package j_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); //다형화, 자식객체에 추가된 멤버는 사용할 수 없음. 사용하려면 캐스팅 해야함.
		
		set.add("Java");//중복된 Java는 한번만 저장됨 
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size(); //저장된 객체 수 얻기
		System.out.println("총 객체수 : " + size);
		
		Iterator<String> iterator = set.iterator(); //반복자 얻기
		
		while(iterator.hasNext()) { //객체 수만큼 루핑
			
			String element = iterator.next(); // 한 개의 객체를 가져온다.
			System.out.println("\t" + element);
		}
		set.remove("Java");//한 개의 객체 삭제
		set.remove("iBATIS");//한 개의 객체 삭제
		
		System.out.println("총 객체수 : " + set.size()); //삭제 후 셋이 가지고 있는 수 얻기
		
		iterator = set.iterator(); //반복자 얻기
		while(iterator.hasNext()) { //객체 수 만큼 루핑
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.clear(); //모든 객체를 제거하고 비움
		if(set.isEmpty()) {
			System.out.println("비어 있음");
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
