package h_api;

import java.util.Comparator;

public class StudentComp implements Comparator<Student>{
	
	@Override
	public int compare(Student s1, Student s2) {
		return s1.score - s2.score; //sno�� score�� �ٲٸ� �������̵�
	}
}

/*public class StudentComp implements Comparator{ <���ʸ��� ���°��>
	
	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.score - s2.score; //sno�� score�� �ٲٸ� �������̵�
	}
}
*/