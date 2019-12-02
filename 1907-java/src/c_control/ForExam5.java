/*
 * 예제5)ForExam.java
 * 1~1000까지의 합계가 5000이 넘는 순간의 수를 출력하시오.
 */
package c_control;

public class ForExam5 {
	ForExam5(){
		int num = 0;		
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			sum = sum+i;
			if(sum>5000) {
				System.out.println(sum);
				break;
			}
		}
	}

}
