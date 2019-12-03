package c_control;

import java.util.Scanner;

public class Exercise07 {
	Exercise07(){
		boolean run = true;
		int balance = 0;
		int inputint = 0;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			
		    inputint = scanner.nextInt();
			//int a = 0;
			//int b = 0;
			if(inputint == 1) {
				System.out.print("예금액> ");
				 = scanner.nextInt();
				//balance = a;
				System.out.println("예금액"+balance+"원");
			}else if(inputint == 2) {
				System.out.println("출금액>");
				b = scanner.nextInt();
				balance = balance-b;
				System.out.println("출금"+balance+"원");
			}else if(inputint == 3) {
				System.out.println("잔고" + balance + "원");
				
			}else if(inputint == 4){				
				run = false;	
			}			
			System.out.println("프로그램 종료");
		}

}
	public static void main(String [] args ) {
		new Exercise07();
	}

}
