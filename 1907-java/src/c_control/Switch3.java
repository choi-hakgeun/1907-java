package c_control;

public class Switch3 {
	
	Switch3() {
		char a = 'B';
		
		switch(a) {
		case 'A':
		case 'a':
			System.out.println("우수회원입니다.");
			break;
		case 'B':
		case 'C':
		case 'd':
			System.out.println("일반회원입니다.");
			break;
			default:
			System.out.println(a);
		}
	}

}
