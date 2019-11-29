package c_control;

public class Ex3 {
	int score = 34;
	int type1() {
		int r = 0;
		
		if(score>= 30) {
			System.out.println("30이상입니다.");
		}
		return r;
	}
	char type2() {
		char r = ' ';
		int score = 50;
		
		if(score>=50) {
			r = 'Q';
			System.out.println("50이상입니다.");
		}
		return r;		
	}
	String type3() {
		String r = null;
		int score = 30;
		
		if(score<=30) {
			System.out.println("30이하입니다.");
		}
		return r;
	}
	
	public static void main(String [] args) {
		Ex3 a = new Ex3();
		int add1 = a.type1();
		char add2 = a.type2();
		String add3 = a.type3();
		System.out.println(add2);
		
	}

}
