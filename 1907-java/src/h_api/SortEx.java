package h_api;

import java.util.Objects;

public class SortEx {
	static Student[] n;
	static int count;
	
	static {
		n = new Student[100];
		Student a = new Student(10, "hong", 60);
		n[0] = a;
		 
		a = new Student(1, "kim", 90);
		n[1] = a;
		
		a = new Student(3, "park", 40);
		n[2] = a;
		
		a =	new Student(8, "lee", 99);
		n[3] = a;
				 
		a = new Student(2, "hong", 66);
		n[4] = a;
		 
		 Student temp = null;
		 for(int i = 0; i<n.length-1 ; i++) {//기준
			 for(int j = (i+1); j<n.length ; j++) {//대상
				 int result = Objects.compare(n[i],n[j],new StudentComp());
				 if(result>0) {//swap
					 temp = n[i];
					 n[i] = n[j];
					 n[j] = temp;
				 }//if
			 }//j
		 }//i
		 
		 for(int i = 0; i<n.length ; i++) {
			 System.out.println(n[i]);
		 }
	}

}
