package a_begin;

public class PromotionExample {
	int a=100;
	int b=100;
	int c=0;
	
	//생성자로 불려지는 메서드
	PromotionExample(){
		c=a+b;
		System.out.println(c);

		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드" + intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubeleValue = intValue;
		System.out.println(doubeleValue);
	}
	
	public static void main(String[] args) {
		new PromotionExample();
	}

}
