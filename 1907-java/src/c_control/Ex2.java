package c_control;

public class Ex2 {
	
	int type1() {
		int r = 0;
		int score = 90;
		
		if(score >=90) {
			System.out.println("90이상입니다.");
		}
		return r;		
	}
	char type2() {
		char r = ' ';
		int score = 80;
		
		if(score <=80 ) {
			r = 'A';
		}
		return r;
	}
	
	String type3() {
		String r = null;
		int score = 70;
		
		if(score >=70) {
			r = "70이상입니다.";
		}
		return r;
	}
	
	public static void main(String [] args) {
		Ex2 a = new Ex2();
		int add1 = a.type1();
		char add2 = a.type2();
		String add3 = a.type3();
		System.out.println(add2);
		System.out.println(add3);
		
	}
	
}
