package c_control;

public class Ex5 {
	String type3() {
		String r = null;
		int score = 90;
		if (score >=90 ) {
			r = "90이상입니다.";
		}
		return r;
	}
	
	public static void main(String [] args) {
		Ex5 add = new Ex5();
		String add1 = add.type3();
		System.out.println(add1);
	}

}
