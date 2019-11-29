package a_begin;

public class First {
	public static void main(String[] args) {
		String name = "chg";
		
		int kor = 90;
		String address = "seoul";
		System.out.println(name);
		System.out.println(address);
		
		int eng = 80;
		
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(kor+eng);
		
		System.out.println(kor>eng);
		
		int sum = 0;
		for(int i = 0; i<100; i++) {
			sum = sum + i;
			System.out.println("1 ´õÇÏ±â 1~100 = " + sum);
		}
	}

}
