package c_control;

public class Ex4 {
	int type1() {
		int r = 0;
		int score = 90;
		
		if(score>=90) {
			r = 90;
		}
		return r;
	}
	void type4() {
		int score = 90;
		if (score >= 90) {
			System.out.println("90이상입니다.");
		}
		
	}
	
	public static void main(String [] args ) {
		Ex4 a = new Ex4();
		int add1 = a.type1();
		System.out.println(add1);
		
		
	}

}
