package c_control;

public class SwitchExample {
	public SwitchExample() {
		String a = "";
		int num = 0;
		
		for( int i = 0 ; i < 500 ; i=i+1) {			
			num = (int)(Math.random()*8) + 1;
			if( num<1 || num>6 ) {
				System.out.println("번호에 오류 발생");
				System.exit(0);
			}
			
		switch(num) {
		case 1 :
			a= "1 입니다.";
			break;
		case 2 :
			a= "2 입니다.";
			break;
		case 3 :
			a = "3 입니다.";
			break;
		case 4 :
			a = "4 입니다.";
			break;
		case 5 :
			a = "5 입니다.";
			break;
		default :
			a = "6 입니다.";
			break;
			} //switch 끝
		System.out.println(a);
		}//for문 끝
	}
}
