package c_control;

import java.util.Scanner;

public class Exercise07 {
	Exercise07(){
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		}
	}

}
