/*3. ProductExam.java
  1) Radio 클래스와 Video 클래스는 형변환이 안됨을 증명하는 코드를 작성 하시오.
  2) Radio, Video, TV 클래스는 Product 클래스로 형변환이 될수 있음을
     증명하는 코드를 작성 하시오.
 */
package g_exception;

public class ProductExam {

	public static void main(String[] args) {
		Tv a = new Tv();
		Video b = new Video();
		Radio c = new Radio();		
		
		
		if (a instanceof Product) {
			Product h = (int) a;
			System.out.println(a.getProductName());
		}else {
			System.out.println("Product 형으로 변환이 불가합니다.");
		}
		System.out.println(b.getProductName());
		System.out.println(c.getProductName());
		
		System.out.println();
		
	}

}
