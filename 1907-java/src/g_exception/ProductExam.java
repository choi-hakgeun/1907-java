/*3. ProductExam.java
  1) Radio 클래스와 Video 클래스는 형변환이 안됨을 증명하는 코드를 작성 하시오.
  2) Radio, Video, TV 클래스는 Product 클래스로 형변환이 될수 있음을
     증명하는 코드를 작성 하시오.
 */
package g_exception;

public class ProductExam {

	public static void main(String[] args) {
		Product a = new Tv();
		Product b = new Video();
		Product c = new Radio();
		
		

	}

}
