/*예제1)
1) Student 클래스를 작성
2) 매개변수가 없는 생성자로 객체를 생성하면 이름, 주소, 연락처를 
"홍길동", "종로구", "010-1111-1111"으로 필드를 초기화
하시오(irum, address, phone)
3)이름을 파라메터로 전달하면 전달된 이름만 필드에 적용되는 생성자를 중복선언 하시오.
4) 이름, 주소, 연락처를 파라메터를 전달하면 모든 값을 필드에 적용하는 생성자를
   중복 선언하시오.
5)main()를 작성하여 위의 요구조건이 처리되는지를 테스트 하시오. 
 */
package e_class;

public class Student {
	String irum;
	String address;
	String phone;	
	
	public Student() {
		this.irum = "홍길동";
		this.address = "종로구";
		this.phone = "010-1111-1111";
		
	}
	public Student(String irum) {
		this.irum = irum;
	}
	public Student(String irum, String a) {		
		this.irum = irum;
		this.address = a;
	}
	public Student(String irum, String address, String phone) {
		this.irum = irum;
		this.address = address;
		this.phone = phone;
	}
	void prn() {
		System.out.println("성명 : " + this.irum);
		System.out.println("주소 : " + this.address);
		System.out.println("연락처 : " + this.phone);
		System.out.println("-----------------------");
		
	}
	public static void main(String [] args) {
		Student a1 = new Student();
		a1.prn();
		
		Student a2 = new Student("일지매");
		a2.prn();
		Student a3 = new Student("홍길동", "마포구");
		a3.prn();
		Student a4 = new Student("춘향이", "남원", "010-1234-1234");
		a4.prn();
		
		System.out.println("성명 : " + a2.irum);
		System.out.println(a3.irum + a3.address);
		System.out.println("성명 : " + a4.irum + " 주소 : " + a4.address +" 연락처 : "+ a4.phone);
	}

}
