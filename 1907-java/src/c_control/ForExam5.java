/*
 * 예제5)ForExam.java
 * 1~1000까지의 합계가 5000이 넘는 순간의 수를 출력하시오.
 * 해설
 * 1) 1~1000까지 루핑
 * 2) 루핑되는 와중에 합계를 구함
 * 3) 연산된 결과가 5000보다 크거나 같다라는것을 판별
 */
package c_control;

public class ForExam5 {
	ForExam5() {
		// int num = 0; (필요없는수)
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			// sum = sum + i;(내가 작성한코드)
			sum += i;
			if (sum >= 4000) {
				System.out.println(i + "," + sum);
				break;
			}
		}
	}
}
