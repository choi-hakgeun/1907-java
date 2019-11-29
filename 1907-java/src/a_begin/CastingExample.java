package a_begin;

public class CastingExample {
	
	public CastingExample(){
	//int->char 44032
	int intValue = 44032;
	char charValue = (char)intValue;
	System.out.println(charValue);
	//long->int 500
	long longValue = 500;
	intValue = (int)longValue;
	System.out.println(intValue);
		
	//double->int 3.14
	double doubleValue = 3.14;
	intValue = (int)doubleValue;
	System.out.println(intValue);
	
	double d2 = 10/(double)3;
	System.out.println(d2);
		
	}
	public static void main(String [] args) {
		new CastingExample();
	}
}
