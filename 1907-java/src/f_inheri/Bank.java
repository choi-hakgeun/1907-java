package f_inheri;
// 개인의 은행정보 모아두는 목적
public class Bank {
	static Account[] ac;
	static int count; //계좌수
	
	static {//a 는 Account 타입의 배열
		ac = new Account[100];
		Account a = new Account("hong", "111-111", 5000);
		ac[0] = a;
		
		a = new Account("kim", "222-222", 10000);
		ac[1] = a;
		
		a = new Account("park", "333-333", 50000);
		ac[2] = a;
		
		count = 3;
	}
	
	Bank(){
	}

}
