/* 2019.11.28 조건문과 반복문
 * 작성일 : 2019.11.28(목) 
 * 수업내용 : if문
 */

package c_control;

public class IfExample {
	
//	IfExemple() {}
	int type1(){
		int r = 0;
		
		int score = 93;		
		
		if( score >= 90 ) {
			//TODO
			System.out.println("점수가 90 이상 입니다.");
			System.out.println("등급은 'A' 등급 입니다.");
		}
		if( score < 90) {
			System.out.println("점수가 90 미만 입니다.");
			System.out.println("등급은 'B' 등급 입니다.");
		}
		
		
		return r;		
	}
	
	String type2() {
		String r = null;
		int s = 90;
		
		if( s>=90 ) {
			r = "90이상임";
			r += "\nA";	
			System.out.println(r);
		}else {
			System.out.println("90미만임");
			System.out.println("B");
		}
		
		
		return r;
	}
	/*
	 * 성적을 if~else if를 사용하여 학점을 구하여 r에 저장하시오.
	 */
	char type3() {
		 char r = ' ';
		 int s = 60;
		 
		 if( s >= 90 ) r = 'A';
		 else if ( s >= 80 ) r = 'B';
		 else if ( s >= 70 ) r = 'C';
		 else if ( s >= 60 ) r = 'D';
		 else r = 'f';
		 
		 /*if( s >= 90 ) {
			 System.out.println("90이상임");
			 System.out.println("A");
		 }else if(s>=80){
			 System.out.println("80이상임");
			 System.out.println("B");			 
		 }else if(s>=70) {
			 System.out.println("70이상임");
			 System.out.println("C");
		 }else if(s>=60) {
			 System.out.println("60이상임");
			 System.out.println("D");
		 }
		 */
		
		return r;
	}
	
	void type4() {
		
	}
	
	public static void main(String [] args) {
		IfExample obj = new IfExample(); //JVM이 매개변수가 없는 생성자를 임대
		int k = obj.type1();
		String m = obj.type2();
		char r = obj.type3();
		System.out.println(r);
	}

}
