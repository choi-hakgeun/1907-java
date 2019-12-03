/*
 * ForExam7.java
 * 1~1000사이의 수중 소수만을 구하여 출력하시오.
 * (소수:1과 자신 이외의 자연수로 나누어 떨어지지 않는 자연수)
 * 미해결 ㅜㅜ
 * 
 */

package c_control;

public class ForExam7 {
	ForExam7() {

		for (int i = 1; i <= 1000; i++) {
			boolean b = true; //i가 소수다.
			for (int j = 2; j < i; j++) {
				if(i%j==0) {
					b = false;
					break;					
				}
			}

		if (b) {
			System.out.print(i + " ");			
			}
		}
	}

}
//if((i%i == 0)&&(i%1 != 0)) {
//		}
