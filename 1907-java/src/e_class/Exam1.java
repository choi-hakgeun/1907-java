/*1)두 정수를 전달받아 합계를 반환하는 메서드를 구현(sum)
 * 2)두 정수(x, y)를 전달받아x~y까지의 합계를 구하여 리턴(sum2)
 * 3. 가로, 세로값을 실수형으로 전달받아 사각형의 넓이를 계산하여 리턴
 * (sum3)
 * 4. 구구단 수를 하나 전달받아 구구단을 하나의 문자열로 만들어 리턴
 * (gugudan) 
 */

package e_class;

public class Exam1 {
	
	
	public int sum(int x, int y) {
		int sum = x+y;
		System.out.println(x + "+" + y + "의 값은 : " +sum);
		return sum;		
	}
	public int sum2(int x, int y) {
		int sum = 0;
		for(int i = x; i<=y ; i++) {
			sum +=i;
		}
		return sum;
	}
	double sum3(double n1, double n2) {
		return n1*n2;
	}
	public String gugudan(int dan) {
		String r = "";
		for(int i = 1; i<=9; i++) {
			int result = dan*i;
			System.out.println(dan +"*" + i + "=" + result);
			r += (dan +"*" + i + "=" + result);
			r += "\n";
		}
		return r;
	}
	

}
