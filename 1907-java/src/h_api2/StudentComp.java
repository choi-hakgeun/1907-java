package h_api2;

import java.util.Comparator;

public class StudentComp implements Comparator<Student>{
	char flag = 'n'; //n이면 학번순, s이면 성적순으로 정렬
	
	public StudentComp(char flag) {
		this.flag = flag;
	}
	
	@Override
	public int compare(Student s1, Student s2) {
		int result = 0;
		if(flag == 'n') {
			result = s1.sno - s2.sno;
		}else {
			result = s1.score - s2.score;
		}
		return result;
		 //sno를 score로 바꾸면 성적순이됨
	}
}

/*public class StudentComp implements Comparator{ <제너릭이 없는경우>
	
	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.score - s2.score; //sno를 score로 바꾸면 성적순이됨
	}
}
*/