package i_thread;

public class ThreadA extends Thread{
	
	ThreadA(){
		this.setName("TreadA...");
		
	}
	@Override
	public void run() {
		for(int i =0; i < 500 ; i++) {			
			System.out.println(getName());
		}
	}

}
