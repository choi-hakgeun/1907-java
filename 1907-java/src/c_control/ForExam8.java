/*2019.12.02 과제
 * for문을 사용하여 아래의 요구 사항을 처리할 수 있도록 프로그램 하시오. 모든 처리는 생성자 ForExam8()안에서 처리하고, 실행은 Main.java에서 실행하시오.


1~100사이의 난수 1000개를 발생시켜 

s1 : 단자리수(0~9)
s10 : 10자리수(10~19)
s20 : 20자리수(20~29)
s30 : 30자리수(30~39)
...
s90 : 90 자리수(90~100)
의 변수에 카운트하여 아래의 출력예시와 같이 출력하시오.

단자리 : xx개
10자리 : xx개
...
90자리 : xx개
[출처] 2019.1202(월) 과제 (JobTC(Job Training Center of Korea)) |작성자 IT여행자
 */

package c_control;

public class ForExam8 {
	ForExam8() {
		//1000개 난수출력
		
		int s1 = 0, s10 = 0, s20 = 0, s30 = 0, s40 = 0, s50 = 0, s60 = 0, s70 = 0, s80 = 0, s90 = 0; 
		
		for(int i = 0; i < 1000; i++) {
			int num = (int)(Math.random()*100)+1;
			
			if(num < 10) {				
				s1++;
			}else if(num < 20) {
				s10++;
			}else if(num < 30) {
				s20++;
			}else if(num < 40) {
				s30++;
			}else if(num < 50) {
			    s40++;
			}else if(num < 60) {
				s50++;
			}else if(num < 70) {
				s60++;
			}else if(num < 80) {
				s70++;				
			}else if(num < 90) {
				s80++;
			}else {
				s90++;
			}
		}
		System.out.println("단자리 : " + s1 + "개");
		System.out.println("10의 자리 : " + s10 + "개");
		System.out.println("20의 자리 : " + s20 + "개");
		System.out.println("30의 자리 : " + s30 + "개");
		System.out.println("40의 자리 : " + s40 + "개");
		System.out.println("50의 자리 : " + s50 + "개");
		System.out.println("60의 자리 : " + s60 + "개");
		System.out.println("70의 자리 : " + s70 + "개");
		System.out.println("80의 자리 : " + s80 + "개");
		System.out.println("90의 자리 : " + s90 + "개");
	}
}
//for(int a = 0; a < 100; a = a+10) 10의 자리 반복
			//int a = num+i; //잘못된 코드 i+를 하지 않아도 1000개가 출력됨
			//System.out.print(num + "  "); //난수1000개출력확인
			
			//int a = 0;			
			//for(; num < 10 ; a++) {
			//System.out.println(a);
			
			/*if(num < 10) {  //단자리수 출력
				for(int a = 0; a>0 ; a++) {
					System.out.print(a +  "  ");					
				}
			}else if(num > 10 && num < 20 ) {
				//System.out.print(num +  "  ");
			}else if(num > 20 && num < 30 ) {
				
			}else if(num > 30 && num < 40 ) {
				
			}else if(num > 40 && num < 50 ) {
				
			}else if(num > 50 && num < 60 ) {
				
			}
			
				//}
			//int s1 = num;					
		
			//for(int b = 0; b < 10 ; b = b+10) {
				
			}
			}
		//}
		
		
		
	}
*/

