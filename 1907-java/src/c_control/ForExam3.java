/*--------------------------
 * 아래와 같은 방정식이 있다. 
 * x값이 1~100사이인 해를 구하여 출력하시오.
 * y = 3x + 1;
 * 
 * 1, 4
 * 2, 7
 * 
 * ...
 * 
 * 100, 301
 */

package c_control;

public class ForExam3 {
	int x = 0;
	int y = 0;
	
	ForExam3(){
		for(int x = 0 ; x < 101 ; x++ ) {
			y = x * 3 + 1;
			System.out.println( x +","+ y );
			
			System.out.printf("(%4d, %4d) \n", x, y);
			
		}
	}

}
