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
		String str = "";
		int s1 = 0; 
		
		for(int i = 0; i < 1000; i++) {
			int num = (int)(Math.random()*100)+1;
			
			if(num < 10) {				
				s1++;
			}
			System.out.println(s1);				
		}
	}
}
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

