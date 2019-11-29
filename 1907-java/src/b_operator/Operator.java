/*
 * 작성일자 : 2019.11
 * 작성자 : chg
 * 각종 연산자에 대한 샘플
 */
package b_operator;

public class Operator {
	Operator() {
		//나머지 연산자
		System.out.println("12%5 => " + (12%5));
		
		// 나머지 연산자 와 3항연산자
		int n = 122;
		
		String r = (n%2==0)? "짝수":"홀수";
		System.out.println( n + " ==> " + r );
		
		// 증감연산자
		// 전치/후치
		
		int a = 10;
		int b = 10;
		
		a++;
		++b;
		System.out.println(a + "," + b);
		
		int c = a++;
		int d = ++b;
		System.out.println(c + "," + d);
		System.out.println(a + "," + b);
		
		String name = "박";
		String irum = "박";
		
		String irum2 = new String("박");
		
		System.out.println(name == irum);
		System.out.println(name == irum2);
		
		System.out.println(name.equals(irum));
		System.out.println(name.equals(irum2));
		
		//&& = tt / || = ff 
		
	}
	public static void main(String[]args) {
		new Operator();
	}

}
