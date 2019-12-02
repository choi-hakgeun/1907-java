/*
 * ForExam6.java
 * 1~1000까지의 수중 5의 배수 이거나 7의 배수만을 출력하시오. 
 */

package c_control;

public class ForExam6 {
	ForExam6() {		
		int sum = 0;		

		for (int i = 0; i <= 1000; i++) {
			sum = i%5;
			if(sum == 0) {
				System.out.println(i);
		
			    System.out.println(i);
			
			    sum = i%7;
				
			
			/*sum = i * 5;
			num = i * 7;
			if ((sum < 1000)&&(num < 1000)) {
				System.out.println(sum);
				System.out.println(num);*/
			}			
		}
	}

}
