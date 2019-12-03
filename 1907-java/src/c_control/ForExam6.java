/*
 * ForExam6.java
 * 1~1000까지의 수중 5의 배수 이거나 7의 배수만을 출력하시오. 
 * 해설
 * 두가지 패턴
 * 1)
 */

package c_control;

public class ForExam6 {
	ForExam6() {
		// type 1
		for (int i = 0; i <= 1000; i++) {
			if (i % 5 == 0 || i % 7 == 0) {
				System.out.println(i);
			}
		}
		// type 2
		for (int i = 5; i <= 1000; i = i + 5) {
			System.out.println(i + " ");
		}
		for (int i = 7; i <= 1000; i = i + 7) {
			System.out.println(i + " ");
		}
	}
}

/*
 * int sum = 0; int s = 0; sum = i * 5; num = i * 7; if ((sum < 1000)&&(num <
 * 1000)) { System.out.println(sum); System.out.println(num);
 */
