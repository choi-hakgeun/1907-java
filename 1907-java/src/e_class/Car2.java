package e_class;

public class Car2 {
	int gas;
	
	public void setGas(int gas) {
		this.gas = gas;
	}
	public boolean isLeftGas() {
		if(gasState) {
			System.out.println("가스없음");
		}
		
	}
	public void run() {
		while(true) {
			if(gas>0) {
				gas--;
				System.out.println("가스량 : " + gas);
			}else {
				System.out.println("가스없음....");
				return;
			}
		}
		
	}

}
