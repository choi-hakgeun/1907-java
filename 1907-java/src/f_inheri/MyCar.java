package f_inheri;

public class MyCar {
	KumhoTire[] front = new KumhoTire[2];
	HankuTire[] back  = new HankuTire[2];
	
	Tire[] tire = new Tire[4]; //2. Tire배열객체 4개생성 하여 tire주소저장 
	
	public static void main(String[] args) {
		MyCar m = new MyCar();//1. m에 MyCar 객체생성, 초기화, 주소저장->
		m.tire[0] = new KumhoTire(); 
		m.back[0] = new HankuTire();
		
		m.tire[0].run();
		/* 개인적인생각
		 * 3.m 시 tire구 [0] 동 의 run()기능 실행
		 * m시 - MyCar :오브젝트
		 * tire구 - Tire[4] : 오브젝트
		 * [0]동 - Tire[4]의 0번째 배열순번
		 * run() 이라는 기능
		 */
		//객체가 HankuTire로 만들어져 있는 경우 참
		Tire h1 = new HankuTire();
		if(h1 instanceof KumhoTire) {
			System.out.println("금호타이어로 만들어짐");
		}else {
			System.out.println("금호타이어로 만들어지지 않음");
		}
	}
}
