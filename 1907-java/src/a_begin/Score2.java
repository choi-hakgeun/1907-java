package a_begin;

public class Score2 {
	public static void main(String[] args) {
		
		String name = "홍길동";
		double ev = 100.0;
		char p = 'A';
		
		System.out.println("이름 : " + name);
		System.out.println("점수 : " + ev);
		System.out.println("학점 : " + p);
		
		int sum = 0;
		for(int dan = 2; dan<10; dan++) {
			System.out.println(dan + "*");
			for(int num = 1; num<10; num++) {
				sum = dan*num;
				System.out.println(dan + "*" + num + "=" + sum);
			}
		}
		
	}

}
