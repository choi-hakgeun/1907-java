package e_class;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100]; //������迭100����
	private static Scanner scanner = new Scanner(System.in);

		
		public static void main(String [] args) {
			boolean run = true;
			while(run) {
				System.out.println("--------------------------------------------------");
				System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
				System.out.println("--------------------------------------------------");
				System.out.println("����> ");
				
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
			System.out.println("���α׷� ����");
		}
		
		//���»����ϱ�
		private static void createAccount() {
			for(int i = 0 ; i < accountArray.length ; i++) {
			accountArray[i].ano;	
			}			
			
		}
		//���¸�Ϻ���
		private static void accountList() {
			
		}
		//�����ϱ�
		private static void deposit(int atm) {
			System.out.println("------------------------");
			System.out.println("����");
			System.out.println("------------------------");
			System.out.print("���¹�ȣ : ");
			String a = scanner.nextLine();  //���¹�ȣ�Է�
			System.out.print("���ݾ� : ");
			int balance = scanner.nextInt();
			
			Account act = findAccount(a);
			
		}
		//����ϱ�
		private static void withdraw() {
			
		}
		
		//Account �迭���� ano�� ������ Account ��ü ã��
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


