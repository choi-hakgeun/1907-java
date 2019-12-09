package e_class;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100]; //단일행배열100생성
	private static Scanner scanner = new Scanner(System.in);

		
		public static void main(String [] args) {
			boolean run = true;
			while(run) {
				System.out.println("--------------------------------------------------");
				System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
				System.out.println("--------------------------------------------------");
				System.out.println("선택> ");
				
				int selectNo = scanner.nextInt();
				
				if(selectNo ==1) {
					createAccount();
				}else if(selectNo == 2) {
					accountList();
				}else if(selectNo == 3) {
					deposit();					
				}else if(selectNo == 4) {
					withdraw();
				}else if(selsctNo == 5) {
					run = false;
				}
			}
			System.out.println("프로그램 종료");
		}
		
		//계좌생성하기
		private static void createAccount() {
			for(int i = 0 ; i < accountArray.length ; i++) {
			accountArray[i].ano;	
			}			
			
		}
		//계좌목록보기
		private static void accountList() {
			
		}
		//예금하기
		private static void deposit(int atm) {
			System.out.println("------------------------");
			System.out.println("예금");
			System.out.println("------------------------");
			System.out.print("계좌번호 : ");
			String a = scanner.nextLine();  //계좌번호입력
			System.out.print("예금액 : ");
			int balance = scanner.nextInt();
			
			Account act = findAccount(a);
			
		}
		//출금하기
		private static void withdraw() {
			
		}
		
		//Account 배열에서 ano와 동일한 Account 객체 찾기
		private static Account findAccount(String ano) {
			Account act = null;
			for(int i = 0 ; i < accountArray.length ; i++) {
				if(accountArray[i]!=null) {
					String a = accountArray[i].getAno();					
					if(a.equals(ano)) {
						act = accountArray[i].getOwner();
						break;
					}
				}
			}
			return act;
		} 

	}


