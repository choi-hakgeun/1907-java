/*
 * 1. Product 클래스를 생성하여 Radio 클래스와 Video 클래스 , TV 클래스를 만들 때 
 *    Product 클래스를 상속 받아 생성하시오.
 *    
class Product{
    public String getProductName(){
       return "product";
    }
}
2. 자식 클래스에서는 getProductName()을 Override하여 자신의 이름이 출력되도록 
조치하시오(예 TV.class => "TV", Radio.class => "Radio")

3. ProductExam.java
  1) Radio 클래스와 Video 클래스는 형변환이 안됨을 증명하는 코드를 작성 하시오.
  2) Radio, Video, TV 클래스는 Product 클래스로 형변환이 될수 있음을 증명하는 코드를 작성 하시오. 
  
[출처] 2019.12.11(수) 과제 (JobTC(Job Training Center of Korea)) |작성자 IT여행자
 */

package g_exception;

public class Product {
	public String getProductName() {
		
		return "product";
	}
	public static void main(String[] args) {
		Tv a = new Tv();
		Video b = new Video();		
		Radio c = new Radio();
		
		System.out.println(a.getProductName());
		System.out.println(b.getProductName());
		System.out.println(c.getProductName());
	}

}
