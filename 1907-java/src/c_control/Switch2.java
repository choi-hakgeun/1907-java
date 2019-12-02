/*
 * 정수형변수 어딘가의 난수를 발생시켜서 저장
 * 랜덤 메서드를 
 * 더블타입의 실수를
 *  * 면 
 *  
 *  8, 9, 10, 11 네개 번호를 추출
 *  연산된결과의 정수
 *  난수가 8이냐
 */
package c_control;

public class Switch2 {	
	Switch2(){
		
		int time = (int)Math.random()*4+8;
		String a = "";		
		System.out.println("[현재시간: " + time + "시]");
		
		switch(time) {		
			case 8:
				a = "출근합니다.";
			case 9:
				a = "회의를 합니다.";
			case 10:
				a = "업무를 합니다.";
				break;
			default:
				a = "외근을 나갑니다.";
			
		}
	}

}
