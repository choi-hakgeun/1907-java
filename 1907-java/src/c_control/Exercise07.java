package c_control; //페키지명

import java.util.Scanner; //스케너 객체호출

public class Exercise07 { //클레스명, 클레스생성
	Exercise07(){ //생성자
		boolean run = true; //논리형 변수 run에 true 대입
		
		int balance = 0; // 정수형 변수 balance 초기화
		
		Scanner scanner = new Scanner(System.in); // 스케너 클레스 생성(별칭이 많음, 인스턴스명, 참조형변수, 오브젝트명 등)
		
		while(run) { //와일문 조건식(run)은 true 인 상태 - 반복조건
			System.out.println("---------------------------------"); //출력
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");//출력
			System.out.println("---------------------------------");//출력
			System.out.print("선택>");//출력
			
			int a = 0; //선택값(숫자입력값) 변수 a 초기화
			a = scanner.nextInt(); //다음 입력정수를 변수 a 에 저장
			
			if( a == 1 ) { // 1 을 입력했을때 같으면(동일하면)
				System.out.print("예금액>"); //예금액> 출력
				balance = balance + scanner.nextInt(); // balance에 다음 입력값(정수)저장 
				System.out.println("잔액 : " + balance);//저장된 balance 값 출력
				//조건식이 아직 true 이기 때문에 보기창은 한번 더 출력됨
				
			}else if( a == 2 ) { // 2를 입력했을때 같으면(동일하면)
				System.out.print("출금액>"); //출금액> 출력
				balance = balance - scanner.nextInt(); //balance 값에서 다음 입력값을 빼고(마이너스) 그 값을 저장
				System.out.println("잔액 : " + balance); //마이너스 된 값 출력
				//조건식이 아직 true 이기 때문에 보기창은 한번 더 출력됨
				
			}else if( a == 3 ) { // 3을 입력했을때 같으면(동일하면)
				System.out.print("잔고 : "); //잔고 문자열 출력
				System.out.println(balance);//저장되있는 balance값 출력
				//조건식이 아직 true 이기 때문에 보기창은 한번 더 출력됨
				
			}else if(a == 4){ //4를 입력했을때 같으면(동일하면)
				run = false;
				System.out.println("프로그램 종료");// 프로그램종료 출력
				//조건식이 false 가 되어 while문 종료
				
		}else {//그 외 값 입력시 오류메세지 출력 후 선택 창 출력
			System.out.println("잘못 입력하셨습니다. 보기에서 선택해주세요.");//오류메세지 출력
			}
			
		}
	}
	public static void main(String [] args) { //누구나 접근 가능한 접근제한자 정적형 반환값 없는 메인메서드
		Exercise07 a = new Exercise07();// 객체생성, 객체주소를 저장할 Exercise07형 변수 a 초기화
	}

}
