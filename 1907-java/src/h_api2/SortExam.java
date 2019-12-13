package h_api2;

import java.util.Arrays;
import java.util.Objects;

public class SortExam {
	
	//숫자형 배열값을 오름차순으로 정렬
	 public void numberSort() {
		 int[] n = {23,213,213,213,21,321,321,3,21,321};
		 System.out.print("정렬전 : ");
		 System.out.println(Arrays.toString(n));//배열을 하나씩 출력
		 int temp = 0;
		 for(int i=0; i<n.length-1; i++) { //기준
			 for(int j= i+1; j<n.length ; j++) {
				 if(n[i]<n[j]) {//swap 부등호만 작다로 바꾸면 내림차순이됨
					 temp = n[i];
					 n[i] = n[j];
					 n[j] = temp;
				 }//if end
			 }//for j end
		 }//for i end
		 System.out.print("정렬후 : ");
		 System.out.println(Arrays.toString(n));
	 }
	 //문자열형 배열값을 오름찬순으로 정렬
	 public void strSort() {
		 String[] n = new String[] {
				 "fasdf", "fdsafsd", "fd45", "가나다", "홍길동"				 
		 };
		 String temp = "";
		 for(int i=0 ; i<n.length-1 ; i++) {//기준
			 for(int j = (i+1); j<n.length ; j++) {//대상
				 if( n[i].compareTo(n[j]) > 0 ) {//swap
					 temp = n[i];
					 n[i] = n[j];
					 n[j] = temp;
				 }//if
			 }//j
		 }//i
		 System.out.println(Arrays.toString(n));
	 }
	 
	 public void objSort() {
		 Student[] n = new Student[] {
				 new Student(10, "hong", 60),
				 new Student(1, "kim", 90),
				 new Student(3, "park", 40),
				 new Student(8, "lee", 99),
				 new Student(2, "hong", 66),
		 };
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

	public static void main(String[] args) {
		SortExam se  = new SortExam();
		//se.numberSort();
		//se.strSort();
		se.objSort();

	}

}
