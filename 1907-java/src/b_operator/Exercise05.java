package b_operator;

public class Exercise05 {
	Exercise05() {
		int value = 4237489;
		System.out.println((value/1000000) * 1000000);
		//value-(value%100)
		
		/*가. 세금계산. 10단위 이하의 금액은 무조건 절삭하여 과금하시오.
		12,340 ==> 12,300

		나. 이자계산. 10단위 이하의 금액은 무조건 절상하시여 지급하시오.

		12,340.5 ==> 12,400*/
		
		int a = 12340;
		int p = (a/100)*100;
		System.out.println(p);
		System.out.println((a/100)*100);
		
		double b = 12340.5;
		int W = (int)((b+99.999)/100)*100; 
				
		System.out.println(W);
		
		int top = 5;
		int bottom = 10;
		int height = 7;	
		double area = 0.5*(top+bottom)*height;
		
		System.out.println(area);
	}
	public static void main(String [] args) {
		new Exercise05();
	}

}
