package c_control;

public class WhileExam3 {
	
	WhileExam3() throws Exception { //throws Exception 충돌방지 예외처리
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("---------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("---------------");
				System.out.println("선택 :");
			}
			keyCode = System.in.read();
			
			if( keyCode == 49 ) { //1을 읽었을 경우
				speed++;
				System.out.println("현재 속도=" + speed);
			}else if (keyCode == 50) {//2를 읽었을 경우
				speed--;
				System.out.println("현재 속도=" + speed);
			}else if (keyCode == 51) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
