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
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------------------");
			System.out.print("����> ");
			
		    inputint = scanner.nextInt();
			//int a = 0;
			//int b = 0;
			if(inputint == 1) {
				System.out.print("���ݾ�> ");
				 = scanner.nextInt();
				//balance = a;
				System.out.println("���ݾ�"+balance+"��");
			}else if(inputint == 2) {
				System.out.println("��ݾ�>");
				b = scanner.nextInt();
				balance = balance-b;
				System.out.println("���"+balance+"��");
			}else if(inputint == 3) {
				System.out.println("�ܰ�" + balance + "��");
				
			}else if(inputint == 4){				
				run = false;	
			}			
			System.out.println("���α׷� ����");
		}

}
	public static void main(String [] args ) {
		new Exercise07();
	}

}
