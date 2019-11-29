package c_control;

public class Ex6 {
	char type() {
		int score = 30;
		char r = ' ';
		
		if( score > 25 ) {
			r = 'A';			
		}
		return r;
	}
	
	int type1() {
		int sum = 0;
		int a = 0;
		int b = 0;
		int r = 0;
		
		for(a = 1; a <= 100 ; a++ ) {
			 sum += a*3;			
		}
		return r;
	}
	public static void main(String [] args) {
		Ex6 a = new Ex6();
		char b = a.type();
		int c = a.type1();
		System.out.println(b);
		System.out.println(c);
		
	}

}
