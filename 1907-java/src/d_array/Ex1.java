package d_array;

import java.util.Scanner;

public class Ex1 {
	String[] n = new String[10];
	int [][] s = new int[10][2];
	int count = 0;
	
	Ex1() {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.입력 | 2.수정 | 3. 조회 및 출력 | 4. 종료");
		    System.out.println("-------------------------------------------");
		    System.out.println("메뉴선택 : ");
		    String menu = scanner.nextLine();		    
		    
		    if(menu.equals("1")) {
		    	input();
		    }
		}
	}
	void input() {
		
	}
	
	
	public static void main(String [] args) {
		new Ex1();
	}
}
	