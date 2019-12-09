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
				}else if(selectNo == 5) {
					run = false;
				}
			}
			System.out.println("프로그램 종료");
		}
		
		//계좌생성하기
		private static void createAccount() {
			Scanner scanner = new Scanner(System.in);
		      System.out.println("---------------");
		      System.out.println("계좌생성");
		      System.out.println("---------------");
		      System.out.println("계좌번호");
		      String ano = scanner.nextLine();
		      System.out.println("계좌주");
		      String owner = scanner.nextLine();
		      System.out.println("초기입금액");
		      int balance = scanner.nextInt();
		      Account newAccount = new Account(ano, owner, balance);
		      for(int i = 0 ; i <accountArray.length; i++) {
		            if(accountArray[i] == null) {
		               accountArray[i] = newAccount;
		            }
		      }
		   }			
			
		
		//계좌목록보기
		private static void accountList() {
			System.out.println("-------------");
			System.out.println("계좌목록");
			System.out.println("-------------");
			for(int i=0;i<accountArray.length;i++){
				Account account =accountArray[i];
				if(account !=null){
					
					System.out.print(account.getAno());
					System.out.print(" ");
					System.out.print(account.getOwner());
					System.out.print(" ");
					System.out.print(account. getBalance());
					System.out.println();
				}
			}
		}
		//예금하기
		private static void deposit() {
			System.out.println("------------------------");
			System.out.println("예금");
			System.out.println("------------------------");
			System.out.print("계좌번호 : ");
			String ano = scanner.nextLine();  //계좌번호입력
			System.out.println();
			System.out.print("예금액 : ");
			int balance = scanner.nextInt();
			
			Account act = findAccount(ano);
			if(act == null) {
				System.out.println("결과 : 계좌가 없습니다.");
			return;	
			}
			act.setBalance(act.getBalance() + balance);
			System.out.println("결과 : 입금이 성공되었습니다.");
		}
		//출금하기
		private static void withdraw() {
			System.out.println("------------------------");
			System.out.println("예금");
			System.out.println("------------------------");
			System.out.print("계좌번호 : ");
			String ano = scanner.nextLine();  //계좌번호입력
			System.out.println();
			System.out.print("출금액 : ");
			int balance = scanner.nextInt();
			
			Account act = findAccount(ano);
			if(act == null) {
				System.out.println("결과 : 계좌가 없습니다.");
			return;	
			}
			act.setBalance(act.getBalance() - balance);
			System.out.println("결과 : 출금이 성공되었습니다.");
		}
		
		//Account 배열에서 ano와 동일한 Account 객체 찾기
		private static Account findAccount(String ano) {
			Account act = null;
			for(int i = 0 ; i < accountArray.length ; i++) {
				if(accountArray[i]!=null) {
					String getAno = accountArray[i].getAno();					
					if(getAno.equals(ano)) {
						act = accountArray[i];
						break;
					}//if end
				}//if end
			}//for end
			return act;
		} 

	}


