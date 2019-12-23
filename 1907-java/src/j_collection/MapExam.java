package j_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExam {
	
	//<String, Integer>
	public void test1() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		//������ �߰�
		map.put("hong", 90);
		map.put("lee", 80);
		map.put("park", 50);
		map.put("kim", 70);
		map.put("choi", 40);
		
		System.out.println("size : " +map.size());
		
		//Ű������ value ���
		System.out.println(map.get("lee"));//80
		
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			int value = map.get(key);//map���� key�� �ش��ϴ� value���� ����������.
			
			System.out.println(key + " : " + value);
		}
			//Map.Entery
			Set<Map.Entry<String, Integer>> set2 = map.entrySet();
			Iterator<Map.Entry<String, Integer>> iter2 = set2.iterator();
			while(iter2.hasNext()) {
				Map.Entry<String, Integer> entry = iter2.next();
				System.out.println(entry.getKey() + " : " + entry.getKey());
			}
			
			map.put("choi", 99);
			System.out.println("���� : " + map.get("choi"));
			
			map.remove("choi");
			
			//how 1 (keySet)
			Set<String> set3 = map.keySet();
			Iterator<String> iter3 = set3.iterator();
			while(iter3.hasNext()) {
				String key1 = iter3.next();
				System.out.println(key1 + ":" + map.get(key1));
			}
			
			System.out.println("--------------------");
			//how 2 (Map.Entry)
			
			Set<Map.Entry<String, Integer>> set4 = map.entrySet();
			Iterator<Map.Entry<String, Integer>> iter4=  set4.iterator();
			while(iter4.hasNext()) {
				Entry<String, Integer> entry = iter4.next();
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
			System.out.println("--------------------");
			
			//how3(for)
			for(Map.Entry<String, Integer> d : set4) {
				System.out.println(d.getKey() + ":" + d.getValue());
			}
		}
		

	// Key���� ������ Student type�� ���
	public void test2() {
		Map<Student, String>map = new HashMap<Student, String>();
		
		//�߰�
		map.put(new Student(100, "hong"), "010-1111-1111");
		map.put(new Student(200, "kim"), "010-2222-2222");
		map.put(new Student(300, "gang"), "011-123-1234");
		prn(map);
		//����
		System.out.println("������----------------");
		map.put(new Student(300, "gang"), "010-7123-1234");
		//����
		System.out.println("������----------------");
		map.remove(new Student(300, "gang"));
		prn(map);
		
	}
	public void prn(Map<Student, String>map) {
		Set<Student> set = map.keySet();
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			Student key = iter.next();
			String value = map.get(key);
			System.out.println(key + ">>>" + value);
		}
	}
	//value���� Sale type�� ���
	public void test3() {
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		//�߰�
		map.put(201901001,new Student(201901001, "ȫ��"));
		map.put(201901002,new Student(201901002, "�ھ�"));
		map.put(201901003,new Student(201901003, "�达"));
		map.put(201901004,new Student(201901004, "�־�"));
		
		prn2(map);
		//�ھ��� �̸��� �达�� ����
		map.put(201901002,  new Student(201901002, "�达"));
		//ȫ���� ����
		map.remove(201901001);
		//���� ����� ���
		prn2(map);
	}
	public void prn2(Map<Integer, Student>map) {
		Set<Integer> set = map.keySet();
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			Integer key = iter.next();
			Student value = map.get(key);
			System.out.println(key + ">>>" + value);
		}
		
	}
	

	public static void main(String[] args) {
		MapExam exam = new MapExam();
		exam.test1();
		exam.test2();
		exam.test3();
			

	}

}
